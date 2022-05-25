package MentorMate_Homeworks.src.Homework_2;

import java.util.Scanner;

public class Task2_EligibleToWork {

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        double age = sc.nextDouble();

        if(age>=16 && age<=66){
            System.out.println("You are eligible to work!");
        }else if(age<=0 || age>= 100){
            System.out.println("Please enter a valid age!");
        }else if(age<=16 || age >=67){
            System.out.println("You are not eligible to work!");
        }
    }
}
