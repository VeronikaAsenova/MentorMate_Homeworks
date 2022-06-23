package MentorMate_Homeworks.src.Homework2_ConditionsLoops;

import java.util.Scanner;

public class Task3_DiscountByQuantity {
    public static void main(String[] args) {

        double price;
        double quantity;
        double revenue;
        double discount;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit price: ");
        price = sc.nextDouble();

        System.out.println("Enter quantity: ");
        quantity = sc.nextDouble();

        revenue = price * quantity;

        if (quantity >= 110 && quantity <= 120) {
            discount = revenue - (revenue * 0.15);

            System.out.println("The revenue from sale is: " + discount);
            System.out.println("Discount: " + revenue * 0.15 + "$(15.0%)");
        } else if (quantity > 120) {
            discount = revenue - (revenue * 0.20);

            System.out.println("The revenue from sale is: " + discount);
            System.out.println("Discount: " + revenue * 0.20 + "$(20.0%)");
        } else if (quantity < 100) {
            discount = revenue - (revenue * 0.00);

            System.out.println("The revenue from sale is: " + discount);
            System.out.println("Discount: " + revenue * 0 + "$(0%)");
        }


    }
}
