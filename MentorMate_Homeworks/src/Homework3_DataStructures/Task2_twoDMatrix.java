package MentorMate_Homeworks.src.Homework3_DataStructures;

import java.util.Scanner;

public class Task2_twoDMatrix {
    public static void main(String[] args) {

        int arr[][] = {
                {2, 7, 9},
                {3, 6, 1,},
                {7, 4, 2,},
                {7, 4, 2,}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

