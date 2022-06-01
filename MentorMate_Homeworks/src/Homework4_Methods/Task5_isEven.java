package MentorMate_Homeworks.src.Homework4_Methods;

public class Task5_isEven {

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(7));
        System.out.println(isEven(53));
        System.out.println(isEven(8));
    }
}
