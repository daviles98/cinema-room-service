import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int nextEven = num % 2 != 0 ? num + 1 : num + 2;
        System.out.println(nextEven);
    }
}