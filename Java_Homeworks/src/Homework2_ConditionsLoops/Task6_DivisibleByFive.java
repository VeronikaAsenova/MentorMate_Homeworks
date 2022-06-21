package MentorMate_Homeworks.src.Homework2_ConditionsLoops;

import java.util.Scanner;

public class Task6_DivisibleByFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int index = 0; index < arr.length - 1; index++) {
            if (arr[index] % 5 == 0) {
                System.out.println("divisible: " + arr[index]);
            }
            if (arr[index] == 150) {
                break;
            }
        }
    }
}


