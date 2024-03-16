package cl.FigurasGeometricas.Area;

public class Rectangulo extends Figura{




   @Override
   public void calcularArea() {

      double areaRectangulo = base * altura;

      System.out.println("EL valor de su area es: " + areaRectangulo);

   }
}
