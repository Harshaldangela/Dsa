package Basic;

import java.util.Scanner;

public class InputOutput {
    public static void printNo(Scanner scanner) {
        int number = scanner.nextInt();
        System.out.println(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNo(scanner);
        scanner.close();
    }
}
