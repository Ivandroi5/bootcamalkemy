package cl.FigurasGeometricas.Area;

public class Circulo extends Figura{

    @Override
    public void calcularArea() {

        double areaCirculo = PI*radio*radio;

        System.out.println("EL valor de su area es: " + areaCirculo);
    }
}
