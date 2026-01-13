package oopmodeling.contact;
	public class add_notes {

	    private collage_list lista;

	    public add_notes(collage_list lista) {
	        this.lista = lista;
	    }

	    // Añadir alumno
	    public boolean addAlumno(String nombre) {
	        if (nombre == null || nombre.isEmpty()) return false;

	        if (lista.buscarAlumno(nombre) != null) {
	            return false; // Ya existe
	        }

	        lista.addAlumno(new collage_list.Alumno(nombre));
	        return true;
	    }

	    // Poner nota al alumno
	    public boolean ponerNota(String nombre, int numeroNota, double nota) {
	        collage_list.Alumno a = lista.buscarAlumno(nombre);

	        if (a == null) return false;
	        if (nota < 0 || nota > 10) return false;

	        if (numeroNota == 1) a.nota1 = nota;
	        else if (numeroNota == 2) a.nota2 = nota;
	        else if (numeroNota == 3) a.nota3 = nota;
	        else return false;

	        return true;
	    }
	}


