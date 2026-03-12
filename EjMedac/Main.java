public class Main {
    public static void main(String[] args) {
        CentroEducativo centro = new CentroEducativo();
        Directivo d = new Directivo("Ana", "López", "11111111A", "ana@medac.es","Directora General", 10);
        centro.añadirDirectivo(d);
        centro.añadirAdministrativo(new Administrativo("Luis", "García", "22222222B","luis@medac.es", "Secretaría", 5));
        centro.añadirAdministrativo(new Administrativo("Marta", "Ruiz", "33333333C","marta@medac.es", "Gestión Académica", 8));
        centro.añadirProfesor(new Profesor("Carlos", "Santos", "44444444D","carlos@medac.es", "Programación", "DAM", 8));
        centro.añadirAlumno(new Alumno("Pedro", "Díaz", "55555555E","pedro@medac.es", "DAW", 6.5));
        centro.mostrarResumen(); //LLAMAR AL METODO
    }
}
