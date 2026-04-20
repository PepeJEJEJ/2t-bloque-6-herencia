
public class Libro {
    private String nombre;
    private Autor autor;
    private Boolean Reservado;
    private int Codigo;
    private Editorial editorial;

    public Libro(String nombre, Autor autor, Editorial editorial, int Codigo) {
        this.nombre = nombre;
        this.autor = autor;
        this.Codigo = Codigo;
        this.editorial = editorial;
        this.Reservado = false;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public Boolean getReservado() {
        return Reservado;
    }

    public void setReservado(Boolean reservado) {
        Reservado = reservado;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public boolean reservar() {
        if (!Reservado) {
            Reservado = true;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (Reservado) {
            Reservado = false;
            return true;
        }
        return false;
    }

    public int getCodigo() {
        return Codigo;
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + " Autor " + autor + " Codigo " + Codigo + (Reservado ? "Reservado" : "Libre");
    }
}
