
package Controller;

import Biblioteca.Libro;
import Biblioteca.Usuario;
import Config.Conexion;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;
/**
 * @author AAMC♡
 */
@Controller
public class Controlador {
    //Instancia de la clase conexion
    Conexion con = new Conexion(); 
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    int id;
    List datos;
    
    @RequestMapping("index.htm")
    public ModelAndView Listar(){
        String sql = "select * from libro";
        List datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("index");
        return mav;    
    }  
    @RequestMapping(value = "agregar.htm", method = RequestMethod.GET)
    public ModelAndView Agregar(){
    mav.addObject(new Libro());
        mav.setViewName("agregar");
        return mav;   
    }  
    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView Agregar(Libro l){
        String sql = "insert into libro(ISBN, NombreDelLibro, NombreDelAutor, EditorialDelLibro, FechaDePublicacion, NumeroDePaginas, Stock)values(?,?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql,l.getISBN(),l.getNombreDelLibro(),l.getNombreDelAutor(),l.getEditorialDelLibro(),l.getFechaDePublicacion(),l.getNumeroDePaginas(),l.getStock());
        return new ModelAndView("redirect:/index.htm");   
    }
    @RequestMapping(value = "editar.htm", method = RequestMethod.GET)
    public ModelAndView Editar(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql ="select * from libro where Id_libro="+id;
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("editar");
        return mav;
    }
    @RequestMapping(value = "editar.htm", method = RequestMethod.POST)
    public ModelAndView Editar(Libro l){
        String sql = "update libro set ISBN=?, NombreDelLibro=?, NombreDelAutor=?,EditorialDelLibro=?, FechaDePublicacion=?, NumeroDePaginas=?, Stock=? where Id_libro=?";
        this.jdbcTemplate.update(sql,l.getISBN(),l.getNombreDelLibro(),l.getNombreDelAutor(),l.getEditorialDelLibro(),l.getFechaDePublicacion(),l.getNumeroDePaginas(),l.getStock(),id);
        return new ModelAndView("redirect:/index.htm");             
    }
    @RequestMapping("eliminar.htm")
    public ModelAndView Eliminar(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from libro where Id_libro="+id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping("usuario.htm")
    public ModelAndView ListarUsuario(){
        String sql = "select * from usuarios";
        List datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("usuario");
        return mav;    
    }  
    @RequestMapping(value = "agregarUsuarios.htm", method = RequestMethod.GET)
    public ModelAndView AgregarUsuario(){
    mav.addObject(new Usuario());
        mav.setViewName("agregarUsuarios");
        return mav;   
    }  
    @RequestMapping(value = "agregarUsuarios.htm", method = RequestMethod.POST)
    public ModelAndView AgregarUsuarios(Usuario l){
        String sql = "insert into usuarios(Id_Usuario, Nombre, Domicilio, FechaDeNacimiento, NumeroDeTelefono, CorreoElectronico)values(?,?,?,?,?,?)";
        this.jdbcTemplate.update(sql,l.getId(),l.getNombre(),l.getDomicilio(),l.getFechaDeNacimiento(),l.getNumeroDeTelefono(),l.getCorreoElectronico());
        return new ModelAndView("redirect:/usuario.htm");   
    }
    @RequestMapping(value = "editarUsuario.htm", method = RequestMethod.GET)
    public ModelAndView EditarUSuarios(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql ="select * from usuarios where Id_Usuario="+id;
        datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("editarUsuario");
        return mav;
    }
    @RequestMapping(value = "editarUsuario.htm", method = RequestMethod.POST)
    public ModelAndView EditarUsuarios(Usuario l){
        String sql = "update usuarios set Id_Usuario=?, Nombre=?, Domicilio=?,FechaDeNacimiento=?, NumeroDeTelefono=?, CorreoElectronico=? where Id_Usuario=?";
        this.jdbcTemplate.update(sql,l.getId(),l.getNombre(),l.getDomicilio(),l.getFechaDeNacimiento(),l.getNumeroDeTelefono(),l.getCorreoElectronico(),id);
        return new ModelAndView("redirect:/usuario.htm");             
    }
    @RequestMapping("eliminarUsuario.htm")
    public ModelAndView EliminarUsuario(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from usuarios where Id_Usuario="+id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/usuario.htm");
    }
    
    @RequestMapping("prestamo.htm")
    public ModelAndView ListarPrestamo(){
        String sql = "select * from prestamo";
        List datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("prestamo");
        return mav;    
    }
    
    @RequestMapping("devolucion.htm")
    public ModelAndView ListarDevolucion(){
        String sql = "select * from devolucion";
        List datos = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("devolucion");
        return mav;    
    }
}