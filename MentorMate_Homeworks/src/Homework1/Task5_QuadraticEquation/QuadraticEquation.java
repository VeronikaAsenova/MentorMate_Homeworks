package Homework_1.Task5_QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int c;
        double formulaDiscriminant;
        double x1;
        double x2;

        System.out.println("Please enter a: ");
        a = sc.nextInt();

        System.out.println("Please enter b: ");
        b = sc.nextInt();

        System.out.println("Please enter c: ");
        c = sc.nextInt();

        formulaDiscriminant = Math.pow(b,2) - 4 *(a * c);
        System.out.println("The Discriminant is: " + formulaDiscriminant);

        if(formulaDiscriminant<0){
            System.out.println("If D < 0, the quadratic equation has no real roots.");
        }else if(formulaDiscriminant==0){
            System.out.println("If D = 0, the equation has 1 real root");
            x1=-b/2*a;
            System.out.println("x1= " + x1);
        }else {
            System.out.println("If D>0, the quadratic equation has 2 real roots.");
            x1 = (-b + Math.sqrt(formulaDiscriminant))/2* a;
            x2 = (-b - Math.sqrt(formulaDiscriminant))/2* a;
            System.out.println("x1 = " + x1 + " and x2 =" + x2);
        }


    }
}

