package MentorMate_Homeworks.src.Homework5_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_DivisionIntegers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        try {
            System.out.println("Enter number 1: ");
            num1 = sc.nextInt();

            System.out.println("Enter number 2: ");
            num2 = sc.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Please enter an integer value!");
            throw new RuntimeException(ime);
        }
        try {
            System.out.println("Division result: " + num1 / num2);
        }catch (ArithmeticException ae){
            System.out.println("Division by zero is forbidden!");
        }
    }
}
