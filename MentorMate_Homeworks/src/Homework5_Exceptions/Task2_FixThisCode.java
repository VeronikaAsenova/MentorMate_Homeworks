package MentorMate_Homeworks.src.Homework5_Exceptions;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Task2_FixThisCode {

        private static FileWriter getFileWriter(String filePath) {
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(filePath, true);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return fileWriter;
        }
        protected static void closeFileWriter(FileWriter fileWriter) {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public static void printToFile(FileWriter fileWriter, String text, int repeat) {
            for (int i = 0; i < repeat; i++) {
                try {
                    fileWriter.append(text + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String filePath = scanner.nextLine();
            int howManyTimesToPrintTheTextToFile = scanner.nextInt();
            String textToAdd = scanner.nextLine();
            printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
        }
    }
