public class Directivo extends Persona {
    private String cargo;
    private int antiguedad;

    public Directivo(String nombre, String apellidos, String dni, String email,
                     String cargo, int antiguedad) {
        super(nombre, apellidos, dni, email);
        this.cargo = cargo;
        this.antiguedad = antiguedad;
    }

    public double pagaExtraAntiguedad() {
        return antiguedad * 25.0;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Cargo: " + cargo +
               ", Antigüedad: " + antiguedad + " años" +
               ", Extra antigüedad: " + pagaExtraAntiguedad() + " €";
    }

    @Override
    public String mostrarDetalles() {
        return nombre + " " + apellidos +
               " es " + cargo +
               " con " + antiguedad + " años de antigüedad y cobra " +
               pagaExtraAntiguedad() + " € extra al mes.";
    }
}
