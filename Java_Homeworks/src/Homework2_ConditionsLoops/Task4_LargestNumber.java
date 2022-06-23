package MentorMate_Homeworks.src.Homework2_ConditionsLoops;

import java.util.Scanner;

public class Task4_LargestNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length of an array: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        System.out.println("Now enter each element: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
// accessing array elements using the for loop
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\nmax: " + max);

    }
}
