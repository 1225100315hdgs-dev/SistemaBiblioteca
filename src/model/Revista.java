package model;

public class Revista extends MaterialBibliografico {
    private int numeroEdicion;
    private String editorial;
    private String categoria;

    public Revista(String titulo, String autor, String isbn, int numeroEdicion, String editorial, String categoria) {
        super(titulo, autor, isbn);
        this.numeroEdicion = numeroEdicion;
        this.editorial = editorial;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Revista [titulo=" + getTitulo() + ", autor=" + getAutor() + ", isbn=" + getIsbn() + ", numeroEdicion="
                + numeroEdicion + ", editorial=" + editorial + ", categoria=" + categoria + ", disponible="
                + isDisponible() + "]";
    }
}
