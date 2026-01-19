package Codigos_Y_Mazmorras;

public class Pelea {

    public void batalla(Heroe heroe, Enemigo enemigo) {
        double poderHeroe = heroe.getFuerza();
        double poderEnemigo = enemigo.getpoderMagico() * 100;
        System.out.println("Pelea: " + heroe.getNombre() + " Contra " + enemigo.getNombre() + " " + enemigo.getTipoEnemigo());
        System.out.println("Poder de nuestro Heroe: " + poderHeroe);
        System.out.println("Poder del Malo: " + poderEnemigo);
        if (poderHeroe > poderEnemigo) {
            System.out.println(heroe.getNombre() + " Ha Salido Invicto");
        } else if (poderHeroe < poderEnemigo) {
            System.out.println("O NO, "+ heroe.getNombre() + " Perecio a manos de " + enemigo.getNombre()+" !");
        } else {
            System.out.println("Sigan Viendo");
        }
    }
}