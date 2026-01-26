package Gestion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Gestor> gestores = new ArrayList<>();

        // Crear 8 gestores
        for (int i = 1; i <= 8; i++) {
            gestores.add(new Gestor("Gestor " + i, "60000000" + i, "gestor" + i + "@mail.com"));
        }

        // Crear empresas
        Autonomo a = new Autonomo("Autónomo Pepe", "111A");
        Pyme p = new Pyme("Pyme Soluciones", "222B", 3, 5);
        GranEmpresa g = new GranEmpresa("MegaCorp", "333C", "Madrid", 5_000_000);

        // Asignación automática
        a.asignarGestor(gestores.get(0)); // 1 gestor

        p.asignarGestor(gestores.get(1)); // 2 gestores
        p.asignarGestor(gestores.get(2));

        g.asignarGestor(gestores.get(3)); // 5 gestores
        g.asignarGestor(gestores.get(4));
        g.asignarGestor(gestores.get(5));
        g.asignarGestor(gestores.get(6));
        g.asignarGestor(gestores.get(7));

        // Mostrar información
        a.mostrarInfo();
        p.mostrarInfo();
        g.mostrarInfo();
    }
}

