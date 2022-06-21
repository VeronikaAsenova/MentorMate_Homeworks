package MentorMate_Homeworks.src.Homework2_ConditionsLoops;

import java.util.Scanner;

public class Task7_ReversedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        for (int index = arr.length - 1; index >= 0; index--) {
            if (index > 0) {
                System.out.print(arr[index] + ", ");
            } else {
                System.out.print(arr[index]);
            }
        }
    }
}
