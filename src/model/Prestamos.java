package model;

public class Prestamos {
    private int idPrestamo;
    private Alumno alumno;
    private MaterialBibliografico material;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private boolean activo;

    public Prestamos(int idPrestamo, Alumno alumno, MaterialBibliografico material, String fechaPrestamo,
            String fechaDevolucion) {
        this.idPrestamo = idPrestamo;
        this.alumno = alumno;
        this.material = material;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.activo = true;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public MaterialBibliografico getMaterial() {
        return material;
    }

    public boolean isActivo() {
        return activo;
    }

    public void finalizar() {
        activo = false;
    }

    @Override
    public String toString() {
        return "Prestamo [id=" + idPrestamo + ", alumno=" + alumno.getNombre() + ", matricula=" + alumno.getMatricula()
                + ", material=" + material.getTitulo() + ", isbn=" + material.getIsbn() + ", fechaPrestamo="
                + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", activo=" + activo + "]";
    }
}
