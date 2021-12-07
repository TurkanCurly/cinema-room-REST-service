import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
        switch (num) {
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;
            case 3:
                System.out.println("move left");
                break;
            case 4:
                System.out.println("move right");
                break;
            case 0:
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");
        }
    }

    public int[] getFirstAndLast(int... args) {
        if (args.length == 1) return new int[]{args[0]};
        return new int[]{args[0], args[args.length - 1]};
    }
}