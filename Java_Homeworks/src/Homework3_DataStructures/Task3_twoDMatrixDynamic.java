package MentorMate_Homeworks.src.Homework3_DataStructures;

import java.util.Scanner;

public class Task3_twoDMatrixDynamic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your desired size of the 2D Array, rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter your desired size of the 2D Array, columns: ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        System.out.println("Enter each element for an Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}