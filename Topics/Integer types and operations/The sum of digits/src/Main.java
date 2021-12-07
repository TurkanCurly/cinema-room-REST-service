import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        final int num1 = num / 100;
        num -= num1 * 100;
        final int num2 = num / 10;
        num -= num2 * 10;
        System.out.println(num + num2 + num1);
    }
}
