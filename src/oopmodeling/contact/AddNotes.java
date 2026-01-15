package oopmodeling.contact;

public class AddNotes {

    private Collage_list adminNotes;

    public AddNotes(Collage_list lista) {
        this.adminNotes = lista;
    }

    // Añadir alumno
    public boolean addAlumno(String nombre) {
        if (nombre == null || nombre.isEmpty()) return false;

        if (adminNotes.buscarAlumno(nombre) != null) {
            return false; // Ya existe
        }

        adminNotes.addAlumno(new Collage_list.Alumno(nombre)); // OJO: depende si Alumno es static
        return true;
    }

    // Poner nota al alumno
    public boolean ponerNota(String nombre, int numeroNota, double nota) {
        Collage_list.Alumno a = adminNotes.buscarAlumno(nombre);

        if (a == null) return false;
        if (nota < 0 || nota > 10) return false;

        switch (numeroNota) {
        case 1:
            a.nota1 = nota;
            break;
        case 2:
            a.nota2 = nota;
            break;
        case 3:
            a.nota3 = nota;
            break;
        default:
            return false;
    }

	        


        return true;
    }
}
