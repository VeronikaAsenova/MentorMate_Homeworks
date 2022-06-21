package MentorMate_Homeworks.src.Homework4_Methods;

public class Task4_countWords {

    static int getWordCount(String sentence) {
        return sentence.split(" ").length;
    }

    public static void main(String[] args) {
        System.out.println(getWordCount("Hello world Hello world!"));
    }
}

