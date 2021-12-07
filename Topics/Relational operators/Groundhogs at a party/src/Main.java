import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        System.out.println(15 <= cups && cups <= 25 && weekend || 10 <= cups && cups <= 20 && !weekend);
    }
}
