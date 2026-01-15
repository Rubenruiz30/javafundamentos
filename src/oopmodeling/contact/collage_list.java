package oopmodeling.contact;
import datastructure.FlexibleArray;

public class Collage_list {

    public static class Alumno {
        String nombre;
        double nota1, nota2, nota3;

        public Alumno(String nombre) {
            this.nombre = nombre;
            this.nota1 = -1;
            this.nota2 = -1;
            this.nota3 = -1; 
        }

        public double media() {
            double suma = 0;
            int cont = 0;

            if (nota1 >= 0) { suma += nota1; cont++; }
            if (nota2 >= 0) { suma += nota2; cont++; }
            if (nota3 >= 0) { suma += nota3; cont++; }

            if (cont == 0) return 0;
            return suma / cont;
        }
    }

    // AQUÍ guardamos todos los alumnos usando FlexibleArray
    private FlexibleArray<Alumno> alumnos = new FlexibleArray<>();

    public void addAlumno(Alumno a) {
        alumnos.add(a);
    }

    public int size() {
        return alumnos.size();
    }

    public Alumno getAlumno(int index) {
        return alumnos.get(index);
    }

    public Alumno buscarAlumno(String nombre) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a = alumnos.get(i);
            if (a.nombre.equalsIgnoreCase(nombre)) return a;
        }
        return null;
    }

    public int buscarIndice(String nombre) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno a = alumnos.get(i);
            if (a.nombre.equalsIgnoreCase(nombre)) return i;
        }
        return -1;
    }

    public boolean eliminarAlumno(String nombre) {
        int idx = buscarIndice(nombre);
        if (idx == -1) return false;
        alumnos.remove(idx);
        return true;
    }
}

