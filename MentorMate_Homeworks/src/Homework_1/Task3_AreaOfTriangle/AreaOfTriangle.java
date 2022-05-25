package Homework_1.Task3_AreaOfTriangle;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        double side;
        double height;
        double area;


        System.out.println("Please enter a triangle's side: ");
        side = sc.nextDouble();

        System.out.println("Please enter a triangle's height: ");
        height = sc.nextDouble();

        area = (side * height)/2;

        System.out.println("The Area of a Triangle with side= " + side + " and height=" + height + " is:" + area);

    }
}
