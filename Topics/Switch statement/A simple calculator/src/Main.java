import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNum = scanner.nextLong();
        String op = scanner.next();
        long secondNum = scanner.nextLong();

        switch (op) {
            case "+":
                System.out.println(firstNum+secondNum);
                break;
            case "-":
                System.out.println(firstNum-secondNum);
                break;
            case "*":
                System.out.println(firstNum*secondNum);
                break;
            case "/":
                String result = secondNum != 0 ? "" + firstNum / secondNum : "Division by 0!";
                System.out.println(result);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}