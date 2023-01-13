import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        boolean isInOrder = true;
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].compareTo(words[i+1]) > 0) {
                isInOrder = false;
                System.out.println("false");
                break;
            }
        }
        if (isInOrder) {
            System.out.println("true");
        }
    }
}