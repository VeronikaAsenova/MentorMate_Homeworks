package MentorMate_Homeworks.src.Homework3_DataStructures;

import java.util.Scanner;

public class Task4_BiggestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desired size of the Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int biggestNum=0;

        System.out.println("Enter each element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            if(biggestNum<arr[i]){
                biggestNum=arr[i];
            }
        }System.out.println("\nYour biggest number in current array is: " + biggestNum);
    }
}

