import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int res = Integer.parseInt(new StringBuilder(num).reverse().toString());
        System.out.println(res);
    }
}