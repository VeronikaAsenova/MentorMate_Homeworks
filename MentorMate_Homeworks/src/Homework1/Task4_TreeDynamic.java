package MentorMate_Homeworks.src.Homework1;

import java.util.Scanner;

public class Task4_TreeDynamic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height");
        int height = sc.nextInt();

        //1st for cycle

        for (int i = 1; i <= height; i++) {

            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i * 2 - 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}




