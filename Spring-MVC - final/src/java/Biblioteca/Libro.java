
package Biblioteca;
/**
 * @author AAMC♡
 */
public class Libro {
    int id;
    int isbn;
    String nombreDelLibro;
    String nombreDelAutor;
    String editorialDelLibro;
    String fechaDePublicacion;
    int numeroDePaginas;
    int stock;

    public Libro() {
        
    }
    public Libro(int id, int isbn, String nombreDelLibro, String nombreDelAutor, String editorialDelLibro, String fechaDePublicacion, int numeroDePaginas, int stock) {
        this.id = id;
        this.isbn = isbn;
        this.nombreDelLibro = nombreDelLibro;
        this.nombreDelAutor = nombreDelAutor;
        this.editorialDelLibro = editorialDelLibro;
        this.fechaDePublicacion = fechaDePublicacion;
        this.numeroDePaginas = numeroDePaginas;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getISBN() {
        return isbn;
    }

    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public String getNombreDelLibro() {
        return nombreDelLibro;
    }

    public void setNombreDelLibro(String nombreDelLibro) {
        this.nombreDelLibro = nombreDelLibro;
    }

    public String getNombreDelAutor() {
        return nombreDelAutor;
    }

    public void setNombreDelAutor(String nombreDelAutor) {
        this.nombreDelAutor = nombreDelAutor;
    }
    
    public String getEditorialDelLibro() {
        return editorialDelLibro;
    }

    public void setEditorialDelLibro(String editorialDelLibro) {
        this.editorialDelLibro = editorialDelLibro;
    }

    public String getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
    
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
