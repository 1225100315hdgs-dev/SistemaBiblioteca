package model;

public class Libro extends MaterialBibliografico {
    private int numeroPaginas;
    private String editorial;

    public Libro(String titulo, String autor, String isbn, int numeroPaginas, String editorial) {
        super(titulo, autor, isbn);
        this.numeroPaginas = numeroPaginas;
        this.editorial = editorial;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + getTitulo() + ", autor=" + getAutor() + ", isbn=" + getIsbn() + ", numeroPaginas="
                + numeroPaginas + ", editorial=" + editorial + ", disponible=" + isDisponible() + "]";
    }
}
