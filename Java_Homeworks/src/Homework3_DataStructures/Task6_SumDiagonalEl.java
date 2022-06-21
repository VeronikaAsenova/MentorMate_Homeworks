package MentorMate_Homeworks.src.Homework3_DataStructures;
import java.util.Scanner;

public class Task6_SumDiagonalEl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum=0;
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }System.out.println();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i]==array[j]){
                    sum+=array[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Ths sum of elements from the left diagonal is: " + sum);
    }
}