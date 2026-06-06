package model;

public class Alumno {
    private String matricula;
    private String nombre;
    private String carrera;
    private int cuatrimestre;
    private String correoElectronico;
    private int prestamosActivos;

    public Alumno(String matricula, String nombre, String carrera, int cuatrimestre, String correoElectronico) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.cuatrimestre = cuatrimestre;
        this.correoElectronico = correoElectronico;
        this.prestamosActivos = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrestamosActivos() {
        return prestamosActivos;
    }

    public void incrementarPrestamos() {
        prestamosActivos++;
    }

    public void decrementarPrestamos() {
        if (prestamosActivos > 0) {
            prestamosActivos--;
        }
    }

    @Override
    public String toString() {
        return "Alumno [matricula=" + matricula + ", nombre=" + nombre + ", carrera=" + carrera + ", cuatrimestre="
                + cuatrimestre + ", correoElectronico=" + correoElectronico + ", prestamosActivos=" + prestamosActivos + "]";
    }
}
