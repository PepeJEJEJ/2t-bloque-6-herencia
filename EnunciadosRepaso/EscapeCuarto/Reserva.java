package EscapeCuarto;

public class Reserva {
    private Cliente cliente;
    private Sala sala;

    public Reserva(Cliente cliente, Sala sala) {
        this.cliente = cliente;
        this.sala = sala;
    }
}