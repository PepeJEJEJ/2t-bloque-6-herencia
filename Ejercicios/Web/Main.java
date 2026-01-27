
public class Main {

   abstract class Figura {
      private String id;
      private String color;
      private float grosorBorde;

      public Figura(String id, String color, float grosorBorde) {
         this.id = id;
         this.color = color;
         this.grosorBorde = grosorBorde;
      }

      public String getId() {
         return id;
      }

      public String getColor() {
         return color;
      }

      public float getGrosorBorde() {
         return grosorBorde;
      }

      public abstract double area();

      public abstract double perimetro();
   }
}

// SOBREECARGA ES MODIFICAR UN METODO DEL PADRE EN EL HIJO (EL OVERRIDE)
// POLIMORFISMO = MISMA LLAMADA, RESULTADO DISTINTO SEGÚN QUIÉN LO EJECUTE

/*
 * Hay que hacer que una aplicación de dibujo pueda crear figuras geométricas
 * (cuadrado, círculo, etc.). Todas tienen color, grosor del borde, id y, si no,
 * un subrayado, además de sus medidas correspondientes (lado, radio, etc.),
 * diferentes para cada una.
 */
/*
 * Hay que hacer que una aplicación de dibujo pueda crear figuras geométricas
 * (cuadrado, círculo, etc.). Todas tienen color, grosor del borde e id,
 * además de sus medidas correspondientes (lado, radio, etc.), diferentes
 * para cada una.
 */