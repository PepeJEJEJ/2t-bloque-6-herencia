package Lenguas;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String nacionalidad;

    public Persona(String nombre, int edad, String genero, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String presentacionIdioma() {
        if (nacionalidad == "Español") {
            return "Hola, soy " + nombre + " soy " + genero + ", tengo " + edad + " annos, y soy " + nacionalidad;
        } else if (nacionalidad == "Ingles") {
            return "Hi, im " + nombre + " im " + genero + ", i got " + edad + " years, and I am " + nacionalidad;
        } else if (nacionalidad == "Frances") {
            return "Bonjour, je'm apelle " + nombre + " je sui " + genero + ", j' ai " + edad + " ans, et je suis "
                    + nacionalidad;
        } else if (nacionalidad == "Italiano") {
            return "Bungiorno amigui, tralalelo tralala, " + nombre + ", brr brr patapim " + genero
                    + " capuchina balerina " + edad
                    + " annos, e chimpansini bananini " + nacionalidad;
        } else {
            return "No hablo eso";
        }
    }

    @Override
    public String toString() {
        return presentacionIdioma();
    }
}
