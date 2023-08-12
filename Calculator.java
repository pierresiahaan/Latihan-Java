import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Sederhana");
        System.out.println("Operasi yang didukung: +, -, *, /");
        System.out.print("Masukkan bilangan pertama: ");
        double num1 = scanner.nextDouble();
        System.out.print("Masukkan operasi: ");
        char operator = scanner.next().charAt(0);
        System.out.print("Masukkan bilangan kedua: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Tidak bisa membagi dengan 0.");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
                return;
        }

        System.out.println("Hasil: " + result);
    }
}
