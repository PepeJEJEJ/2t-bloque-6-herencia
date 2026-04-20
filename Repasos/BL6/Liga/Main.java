package Liga;

public class Main {
    public static void main(String[] args) {
        Equipo equipo1=new Equipo("Seleccion Romani", "Las 3000", 312424, 100);
        Equipo equipo2=new Equipo("Real Madrid", "Madrid", 241241240, 411240);
        Equipo equipo3=new Equipo("Seleccion de Sealand", "Sealand", 1420, 420);
        Equipo equipo4=new Equipo("Jaguares", "Mexico", 1420, 1420);
        Equipo equipo5=new Equipo("Barça Comprarbitros", "Barcelonamegos", 1351, 1133);
        Jugador jugador1=new Jugador("Lamine, Rey de Karaz Ankor", 19, "Delantero", equipo5);
        Jugador jugador2=new Jugador("Cristiano Ronaldo", 26, "Delantero", equipo2);
        Jugador jugador3=new Jugador("Xurumbe", 31, "Defensa", equipo1);
        Jugador jugador4=new Jugador("Hurrycane", 31, "Defensa", equipo3);
        Jugador jugador5=new Jugador("Peña", 50, "Lateral", equipo4);
        Arbitro arbitro1=new Arbitro("El Jiennense", 20, "Internacional");
        Arbitro arbitro2=new Arbitro("El Sobornao por el barsa", 30, "Nacional");
    }
}
