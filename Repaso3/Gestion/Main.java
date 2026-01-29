package Gestion;

public class Main {

    public static void main(String[] args) {

        // Array normal de 8 gestores
        Gestor[] gestores = new Gestor[8];

        // Crear 8 gestores
        for (int i = 0; i < gestores.length; i++) {
            gestores[i] = new Gestor(
                "Gestor " + (i + 1),
                "60000000" + (i + 1),
                "gestor" + (i + 1) + "@mail.com"
            );
        }

        // Crear empresas
        Autonomo a = new Autonomo("Autónomo Pepe", "111A");
        Pyme p = new Pyme("Pyme Soluciones", "222B", 3, 5);
        GranEmpresa g = new GranEmpresa("MegaCorp", "333C", "Madrid", 5_000_000);

        // Asignación automática
        a.asignarGestor(gestores[0]); // 1 gestor

        p.asignarGestor(gestores[1]); // 2 gestores
        p.asignarGestor(gestores[2]);

        g.asignarGestor(gestores[3]); // 5 gestores
        g.asignarGestor(gestores[4]);
        g.asignarGestor(gestores[5]);
        g.asignarGestor(gestores[6]);
        g.asignarGestor(gestores[7]);

        // Mostrar información
        a.mostrarInfo();
        p.mostrarInfo();
        g.mostrarInfo();
    }
}
