package MentorMate_Homeworks.src.Homework4_Methods;

public class Task3_middleCharacter {

    static void findMiddleCharacter(String string) {
        char[] myArray = string.toCharArray();

        if (string.length() % 2 == 0) {
            //even
            int count = string.length() / 2;
            char firstHalfChar = myArray[count - 1];
            char secondHalfChar = myArray[count];

            System.out.println(String.valueOf(firstHalfChar) + String.valueOf(secondHalfChar));
        }
        else {
            //odd
            char charToGet = myArray[myArray.length / 2];
            System.out.println(String.valueOf(charToGet));
        }
    }
    public static void main (String[] args){
        findMiddleCharacter("VictorVictor");
        findMiddleCharacter("Veronika");
        findMiddleCharacter("PeterPlet");
    }
}
