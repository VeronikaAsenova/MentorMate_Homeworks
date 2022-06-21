package MentorMate_Homeworks.src.Homework5_Constructors;

public class Test {

    public static void main(String[] args) {

        Cars car0 = new Cars();
        Cars car1 = new Cars("Opel", "black", 2008, 150, true);
        Cars car2 = new Cars("Mercedes", "blue", true);
        Cars car3 = new Cars("Toyota", "white", 2021, 220);
        Cars car4 = new Cars("Dodge", 2019, 400, false);
        Cars car5 = new Cars(1995, 400, false);

        System.out.println(car0);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}

