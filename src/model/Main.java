package model;

public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        // ── Agregar materiales ──────────────────────────────────
        sistema.agregarMaterial(new Libro("Clean Code", "Robert Martin", "ISBN-001", 431, "Prentice Hall"));
        
        // ── Registrar alumnos ───────────────────────────────────
        sistema.registrarAlumno(new Alumno("A001", "Carlos Mendoza", "Sistemas", 5, "a001@utng.edu.mx"));
        sistema.registrarAlumno(new Alumno("A002", "Maria Torres", "Industrial", 3, "a002@utng.edu.mx"));

        // ── Ver materiales disponibles ──────────────────────────
        sistema.mostrarMaterialesDisponibles();

        // ── Realizar préstamos ──────────────────────────────────
        System.out.println("\n=== REALIZANDO PRESTAMOS ===");
        sistema.registrarPrestamo("A001", "ISBN-001", "02/06/2026", "09/06/2026");
        sistema.registrarPrestamo("A001", "ISBN-004", "02/06/2026", "09/06/2026");

        // ── Ver préstamos activos ───────────────────────────────
        sistema.mostrarPrestamosActivos();

        // ── Devolver un material ────────────────────────────────
        System.out.println("\n=== DEVOLUCION ===");
        sistema.devolverMaterial(1);

        // ── Ver materiales disponibles después de devolución ────
        sistema.mostrarMaterialesDisponibles();

        // ── Ver alumnos ─────────────────────────────────────────
        sistema.mostrarAlumnos();
    }
}
