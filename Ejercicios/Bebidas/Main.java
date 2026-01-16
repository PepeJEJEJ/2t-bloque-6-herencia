package Ejercicios.Bebidas;

import java.util.Scanner;
/*Ejercicio almacén de bebidas.
Supongamos que debemos hacer un software para un almacén de bebidas.
En el almacén hay zumos, refrescos y bebidas alcohólicas. Todas tienen nombre, marca y precio 
(precio por cada litro). Añade también a cada una algún dato extra que consideres importante de cada bebida en concreto.
Todas las clases deben tener los siguientes métodos:
- Un método que reciba la edad del usuario e indique si puede tomar dicha bebida o no.
- Un método que reciba el volumen de la botella e indique el precio total.*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos Anos tienes? (Tu edad porfa)");
        int edad = sc.nextInt();
        if (edad < 18) {
            System.out.println("NO, MIS COJONES VAS A BEBER ALCOHOL >:c");
            System.out.println("Tenemos bebidas, mira:");
            System.out.println("1 Zumos");
            System.out.println("2 Refrescos");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Del 1 al 3 hay");
                    Zumo zumo1 = new Zumo("Pis de color Trump", "Naranjito HDTPTM.", 33);
                    Zumo zumo2 = new Zumo("Manzanota la del qlo", "Manzanares Fuera.", 33);
                    Zumo zumo3 = new Zumo("Zumo de Fentanilo", "Grupos Delictivos", 33);
                    System.out.println(zumo1);
                    System.out.println(zumo2);
                    System.out.println(zumo3);
                    int sex = sc.nextInt();
                    switch (sex) {
                        case 1:
                            System.out.println(zumo1);
                            break;
                        case 2:
                            System.out.println(zumo2);
                            break;
                        case 3:
                            System.out.println(zumo3);
                            break;

                        default:
                            System.out.println("Aqui no damos eso");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Del 1 al 3 hay");
                    Refresco refresco1 = new Refresco("Coca Ina", "Pablo Escobar", 1);
                    Refresco refresco2 = new Refresco("Fanta Smas", "El Gob.", 2);
                    Refresco refresco3 = new Refresco("Esprai", "Pimienta", 2);
                    System.out.println(refresco1);
                    System.out.println(refresco2);
                    System.out.println(refresco3);
                    int sex1 = sc.nextInt();
                    switch (sex1) {
                        case 1:
                            System.out.println(refresco1);
                            break;
                        case 2:
                            System.out.println(refresco2);
                            break;
                        case 3:
                            System.out.println(refresco3);
                            break;

                        default:
                            System.out.println("Aqui no damos eso");
                            break;
                    }
                    break;
                default:
                    System.out.println("ESA NO LA TENGO");
                    break;
            }
        } else if (edad > 18) {
            System.out.println("Tenemos bebidas, mira:");
            System.out.println("1 Zumos");
            System.out.println("2 Refrescos");
            System.out.println("3 Alcohol");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Del 1 al 3 hay");
                    Zumo zumo1 = new Zumo("Pis de color Trump", "Naranjito HDTPTM.", 33);
                    Zumo zumo2 = new Zumo("Manzanota la del qlo", "Manzanares Fuera.", 33);
                    Zumo zumo3 = new Zumo("Zumo de Fentanilo", "Grupos Delictivos", 33);
                    System.out.println(zumo1);
                    System.out.println(zumo2);
                    System.out.println(zumo3);
                    int sex = sc.nextInt();
                    switch (sex) {
                        case 1:
                            System.out.println(zumo1);
                            break;
                        case 2:
                            System.out.println(zumo2);
                            break;
                        case 3:
                            System.out.println(zumo3);
                            break;

                        default:
                            System.out.println("Aqui no damos eso");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Del 1 al 3 hay");
                    Refresco refresco1 = new Refresco("Coca Ina", "Pablo Escobar", 1);
                    Refresco refresco2 = new Refresco("Fanta Smas", "El Gob.", 2);
                    Refresco refresco3 = new Refresco("Esprai", "Pimienta", 2);
                    System.out.println(refresco1);
                    System.out.println(refresco2);
                    System.out.println(refresco3);
                    int sex1 = sc.nextInt();
                    switch (sex1) {
                        case 1:
                            System.out.println(refresco1);
                            break;
                        case 2:
                            System.out.println(refresco2);
                            break;
                        case 3:
                            System.out.println(refresco3);
                            break;

                        default:
                            System.out.println("Aqui no damos eso");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Del 1 al 3 hay");
                    Alcohol alcohol1 = new Alcohol("Blue Label", "Johnnie Walker", 31, false);
                    Alcohol alcohol2 = new Alcohol("Wodka", "Paises de la Comunidad de Estados Independientes", 200,
                            false);
                    Alcohol alcohol3 = new Alcohol("Vino", "Viva el Vino!!", 141224, false);
                    System.out.println(alcohol1);
                    System.out.println(alcohol2);
                    System.out.println(alcohol3);
                    int sex2 = sc.nextInt();
                    switch (sex2) {
                        case 1:
                            System.out.println(alcohol1);
                            alcohol1.setElisir(true);
                            break;
                        case 2:
                            System.out.println(alcohol2);
                            break;
                        case 3:
                            System.out.println(alcohol3);
                            break;

                        default:
                            System.out.println("Aqui no damos eso");
                            break;
                    }
                    break;
                default:
                    System.out.println("ESA NO LA TENGO");
                    break;
            }
        }else{
            System.out.println("Si ya, y ahora me diras que vivistes en los tiempos de Jesucristo y por eso tienes 1234214872141427142142671422885891286915299658186918956325132869 años");
        }
    }
}
