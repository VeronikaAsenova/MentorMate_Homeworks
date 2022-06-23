package MentorMate_Homeworks.src.Homework4_Methods;

public class Task1_smallestNumber {
    static void getSmallestNum(int a, int b, int c){
        if(a<=b && a<=c){
            System.out.println("The smallest number is a: " + a);
        }
        else if(b<=a && b<=c){
            System.out.println("The smallest number is b: " + b);
        }
        else if(c<=b && c<=a){
            System.out.println("The smallest number is c: " + c);
        }
    }
    public static void main (String[] args){
        getSmallestNum(5,-5,-60);
    }
}


