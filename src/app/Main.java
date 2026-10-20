package app;

import java.util.Scanner;

public class Main {

    static double calculateTax(double income) {
        double rate;
        if (income <= 10000) {
            rate = 0.025;
        } else if (income <= 25000) {
            rate = 0.043;
        } else {
            rate = 0.067;
        }
        return income * rate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть суму доходу: ");
        double income = scanner.nextDouble();
        System.out.printf("Сума податку: %.2f%n", calculateTax(income));
    }
}