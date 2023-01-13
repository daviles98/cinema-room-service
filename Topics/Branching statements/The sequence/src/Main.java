import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> seq = new ArrayList<>();
        boolean equalCount = false;
        int totalCount = 0;
        for (int i = 1; (i <= n) && !equalCount ; i++) {
            for (int j = 0; j < i; j++) {
                ++totalCount;
                System.out.print(i + " ");
                if (totalCount == n) {
                    equalCount = true;
                    break;
                }
            }
        }
    }
}