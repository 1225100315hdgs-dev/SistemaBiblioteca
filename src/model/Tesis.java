package model;

public class Tesis extends MaterialBibliografico {
    private String carrera;
    private int anoPublicacion;
    private String directorTesis;

    public Tesis(String titulo, String autor, String isbn, String carrera, int anoPublicacion,
            String directorTesis) {
        super(titulo, autor, isbn);
        this.carrera = carrera;
        this.anoPublicacion = anoPublicacion;
        this.directorTesis = directorTesis;
    }

    

    @Override
    public String toString() {
        return "Tesis [titulo=" + getTitulo() + ", autor=" + getAutor() + ", isbn=" + getIsbn() + ", carrera="
                + carrera + ", anoPublicacion=" + anoPublicacion + ", directorTesis=" + directorTesis + ", disponible="
                + isDisponible() + "]";
    }
}
