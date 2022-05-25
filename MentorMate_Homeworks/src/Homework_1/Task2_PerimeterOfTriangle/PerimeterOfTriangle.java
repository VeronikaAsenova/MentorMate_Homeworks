package Homework_1.Task2_PerimeterOfTriangle;

import java.util.Scanner;

public class PerimeterOfTriangle {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Please enter a: ");
        a = sc.nextDouble();

        System.out.println("Please enter b: ");
        b = sc.nextDouble();

        System.out.println("Please enter c: ");
        c = sc.nextDouble();

        System.out.println("The Perimeter of a Triangle with sides a=" + a + "  b=" + b + "  c=" + c + "  is: P=" + (a+b+c));

    }
}
