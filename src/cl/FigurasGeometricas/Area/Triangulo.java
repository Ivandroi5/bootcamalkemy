package cl.FigurasGeometricas.Area;

public class Triangulo extends Figura{
    @Override
    public void calcularArea() {

        double areaTriangulo= (base*altura)/2;

        System.out.println("EL valor de su area es: " + areaTriangulo);

    }
}
