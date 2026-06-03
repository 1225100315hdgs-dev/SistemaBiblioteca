package model;

public class Periodico extends MaterialBibliografico {
    private String fechaPublicacion;
    private String seccion;
    private String nombrePeriodico;

    public Periodico(String titulo, String autor, String isbn, String fechaPublicacion, String seccion,
            String nombrePeriodico) {
        super(titulo, autor, isbn);
        this.fechaPublicacion = fechaPublicacion;
        this.seccion = seccion;
        this.nombrePeriodico = nombrePeriodico;
    }

    @Override
    public String toString() {
        return "Periodico [titulo=" + getTitulo() + ", autor=" + getAutor() + ", isbn=" + getIsbn() + ", fechaPublicacion="
                + fechaPublicacion + ", seccion=" + seccion + ", nombrePeriodico=" + nombrePeriodico + ", disponible="
                + isDisponible() + "]";
    }
}
