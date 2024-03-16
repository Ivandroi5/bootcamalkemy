import cl.FigurasGeometricas.Area.Circulo;
import cl.FigurasGeometricas.Area.Figura;
import cl.FigurasGeometricas.Area.Rectangulo;
import cl.FigurasGeometricas.Area.Triangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al calculador de Area");

        Rectangulo rectangulo =new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Scanner scanner = new Scanner (System.in);

       Figura.preguntarFiguras();


       switch (Figura.Menu){
            case 1:
            rectangulo.calcularArea();
            break;

            case 2:
            triangulo.calcularArea();
            break;

            case 3:

            circulo.calcularArea();
            break;

            default:
            System.out.println("El menú ingresado no corresponde");
            break;
        }

    scanner.close();

    }
}