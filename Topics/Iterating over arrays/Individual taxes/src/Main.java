import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCompanies = scanner.nextInt();
        int[] yearlyIncomes = new int[numOfCompanies];
        double[] percentTaxes = new double[numOfCompanies];
        double[] companyTaxes = new double[numOfCompanies];
        int max = 0;
        for (int i = 0; i < numOfCompanies; i++) {
            yearlyIncomes[i] = scanner.nextInt();
        }
        for (int i = 0; i < numOfCompanies; i++) {
            percentTaxes[i] = scanner.nextInt() * 0.01;
        }
        for (int i = 0; i < numOfCompanies; i++) {
            companyTaxes[i] = yearlyIncomes[i] * percentTaxes[i];
            if (companyTaxes[i] >= companyTaxes[max]) {
                max = i;
            }
        }
        System.out.println(max+1);

    }
}