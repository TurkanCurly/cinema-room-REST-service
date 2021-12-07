import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();
        int res = (int) Math.ceil((float) (height - night) / (day - night));
        System.out.println(res);

    }
}
