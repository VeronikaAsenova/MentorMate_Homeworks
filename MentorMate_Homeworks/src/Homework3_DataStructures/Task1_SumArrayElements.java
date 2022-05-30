package MentorMate_Homeworks.src.Homework3_DataStructures;

import java.util.Scanner;

public class Task1_SumArrayElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = {2, 5, 4, 8, 9, 4};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
