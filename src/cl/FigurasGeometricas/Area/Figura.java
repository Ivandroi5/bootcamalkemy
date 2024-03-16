package cl.FigurasGeometricas.Area;

import java.util.Scanner;

public abstract class Figura  {

    public static int Menu;
    public static double base;

    public static double altura;

    public static double radio;

    public final double PI = 3.1416;

public static void preguntarFiguras(){

    Scanner scanner = new Scanner(System.in);
    System.out.println("---------------------------------------------------");
    System.out.println("Ingrese la figura que desee calcular el area");
    System.out.println("---------------------------------------------------");

    System.out.println("Rectángulo : 1");
    System.out.println("Triángulo : 2");
    System.out.println("Círculo : 3");

    System.out.println("---------------------------------------------------");

    Menu = scanner.nextInt();

    if (Menu == 3) {
        System.out.println("Ingrese el valor del radio");
        radio = scanner.nextDouble();
    }
    else {

        System.out.println("---------------------------------------------------");


        System.out.println("Ingrese el valor de la base");

        base = scanner.nextDouble();
        System.out.println("Ingrese el valor de la altura");

        altura = scanner.nextDouble();

        System.out.println("---------------------------------------------------");
    }

}


    protected abstract void calcularArea();

}
