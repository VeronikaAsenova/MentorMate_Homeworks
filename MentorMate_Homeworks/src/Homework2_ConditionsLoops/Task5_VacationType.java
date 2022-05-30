package MentorMate_Homeworks.src.Homework2_ConditionsLoops;

import java.util.Scanner;

public class Task5_VacationType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String vacationType;
        double budget;

        System.out.println("Enter your preferred type of vacation (Beach or Mountain): ");
        vacationType = sc.nextLine().toLowerCase();

        if (!vacationType.equals("beach") && !vacationType.equals("mountain")) {
            System.out.println("There is no information about this vacation type!");
        } else {
            System.out.println("Enter your budget, please: ");
            budget = sc.nextDouble();

            if (budget <= 0) {
                System.out.println("Please, enter a valid budget!");
            } else {
                if (vacationType.equals("beach")) {
                    if (budget <= 50) {
                        System.out.println("We recommend Bulgaria as your best choice!");
                    } else {
                        System.out.println("We recommend outside Bulgaria as your best choice!");
                    }
                }

                if (vacationType.equals("mountain")) {
                    if (budget <= 30) {
                        System.out.println("We recommend Bulgaria as your best choice!");
                    } else {
                        System.out.println("We recommend outside Bulgaria as your best choice!");
                    }
                }
            }
        }


    }
}
