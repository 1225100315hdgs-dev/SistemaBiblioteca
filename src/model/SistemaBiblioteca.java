package model;

import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {
    private List<MaterialBibliografico> materiales = new ArrayList<>();
    private List<Alumno> alumnos = new ArrayList<>();
    private List<Prestamos> prestamos = new ArrayList<>();
    private int siguienteIdPrestamo = 1;

    public void agregarMaterial(MaterialBibliografico material) {
        materiales.add(material);
    }

    public void registrarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void mostrarMaterialesDisponibles() {
        System.out.println("=== MATERIALES DISPONIBLES ===");
        for (MaterialBibliografico material : materiales) {
            if (material.isDisponible()) {
                System.out.println(material);
            }
        }
    }

    public void mostrarAlumnos() {
        System.out.println("=== ALUMNOS REGISTRADOS ===");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void mostrarPrestamosActivos() {
        System.out.println("=== PRESTAMOS ACTIVOS ===");
        for (Prestamos prestamo : prestamos) {
            if (prestamo.isActivo()) {
                System.out.println(prestamo);
            }
        }
    }

    public Alumno buscarAlumno(String matricula) {
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equalsIgnoreCase(matricula)) {
                return alumno;
            }
        }
        return null;
    }

    public MaterialBibliografico buscarMaterial(String isbn) {
        for (MaterialBibliografico material : materiales) {
            if (material.getIsbn().equalsIgnoreCase(isbn)) {
                return material;
            }
        }
        return null;
    }

    public void registrarPrestamo(String matricula, String isbn, String fechaPrestamo, String fechaDevolucion) {
        Alumno alumno = buscarAlumno(matricula);
        if (alumno == null) {
            System.out.println("Alumno con matricula " + matricula + " no encontrado.");
            return;
        }

        MaterialBibliografico material = buscarMaterial(isbn);
        if (material == null) {
            System.out.println("Material con ISBN " + isbn + " no encontrado.");
            return;
        }

        if (!material.isDisponible()) {
            System.out.println("El material '" + material.getTitulo() + "' no está disponible.");
            return;
        }

        if (alumno.getPrestamosActivos() >= 3) {
            System.out.println("El alumno " + alumno.getNombre() + " ya tiene el máximo de préstamos activos.");
            return;
        }

        if (material instanceof Tesis) {
            System.out.println("No se permite prestar tesis.");
            return;
        }

        Prestamos prestamo = new Prestamos(siguienteIdPrestamo++, alumno, material, fechaPrestamo, fechaDevolucion);
        prestamos.add(prestamo);
        material.setDisponible(false);
        alumno.incrementarPrestamos();
        System.out.println("Préstamo registrado: " + prestamo);
    }

    public void devolverMaterial(int idPrestamo) {
        for (Prestamos prestamo : prestamos) {
            if (prestamo.getIdPrestamo() == idPrestamo && prestamo.isActivo()) {
                prestamo.finalizar();
                prestamo.getMaterial().setDisponible(true);
                prestamo.getAlumno().decrementarPrestamos();
                System.out.println("Devolución registrada del préstamo " + idPrestamo);
                return;
            }
        }
        System.out.println("No se encontró un préstamo activo con id " + idPrestamo);
    }
}
