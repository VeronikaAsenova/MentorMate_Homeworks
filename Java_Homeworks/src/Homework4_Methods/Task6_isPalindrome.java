package MentorMate_Homeworks.src.Homework4_Methods;

public class Task6_isPalindrome {
    static boolean isPalindrome(String string) {
        char[] myArray = string.toCharArray();
        int count = string.length() / 2;
        String firstHalf = "";
        String secondHalf = "";
        String reversedSecondHalf = "";

        // Take first half
        for (int i = 0; i < count; i++) {
            firstHalf += String.valueOf(myArray[i]);
        }

        if (string.length() % 2 == 0) {
            //even

            //Take second half
            for (int i = count; i < myArray.length; i++) {
                secondHalf += String.valueOf(myArray[i]);
            }
        } else {
            //odd

            //Take second half in a different way, by skipping the middle element
            for (int i = count + 1; i < myArray.length; i++) {
                secondHalf += String.valueOf(myArray[i]);
            }
        }

        // Reverse the second half
        for (int i = secondHalf.length() - 1; i >= 0; i--) {
            reversedSecondHalf += String.valueOf(secondHalf.toCharArray()[i]);
        }

        return firstHalf.equals(reversedSecondHalf);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(String.valueOf(3443)));
        System.out.println(isPalindrome(String.valueOf(34543)));
        System.out.println(isPalindrome(String.valueOf(345143)));
    }
}
