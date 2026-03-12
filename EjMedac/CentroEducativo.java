public class CentroEducativo {
    private Directivo directivo;
    private Administrativo[] administrativos;
    private Profesor[] profesores;
    private Alumno[] alumnos;
    private int numAdministrativos = 0;
    private int numProfesores = 0;
    private int numAlumnos = 0;
//ARRAYS Y METODOS
    public CentroEducativo() {
        administrativos = new Administrativo[2];
        profesores = new Profesor[5];
        alumnos = new Alumno[10];
    }

    public void añadirDirectivo(Directivo d) {
        if (directivo != null) {
            System.out.println("Ya hay un directivo, no se puede añadir otro.");
        } else {
            directivo = d;
        }
    }

    public void añadirAdministrativo(Administrativo a) {
        if (numAdministrativos >= administrativos.length) {
            System.out.println("No se pueden añadir más administrativos.");
        } else {
            administrativos[numAdministrativos++] = a;
        }
    }

    public void añadirProfesor(Profesor p) {
        if (numProfesores >= profesores.length) {
            System.out.println("No se pueden añadir más profesores.");
        } else {
            profesores[numProfesores++] = p;
        }
    }

    public void añadirAlumno(Alumno a) {
        if (numAlumnos >= alumnos.length) {
            System.out.println("No se pueden añadir más alumnos.");
        } else {
            alumnos[numAlumnos++] = a;
        }
    }

    public void mostrarResumen() {
        System.out.println("=== Centro Educativo ===");
        if (directivo != null) {
            System.out.println("Directivo: " + directivo.mostrarDetalles());
        }
        System.out.println("Administrativos:");
        for (int i = 0; i < numAdministrativos; i++) {
            System.out.println(" - " + administrativos[i].mostrarDetalles());
        }
        System.out.println("Profesores:");
        for (int i = 0; i < numProfesores; i++) {
            System.out.println(" - " + profesores[i].mostrarDetalles());
        }
        System.out.println("Alumnos:");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println(" - " + alumnos[i].mostrarDetalles());
        }
    }
}
