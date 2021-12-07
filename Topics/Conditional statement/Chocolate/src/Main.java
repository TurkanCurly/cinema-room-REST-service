import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int length = scanner.nextInt();
//        int width = scanner.nextInt();
//        int parts = scanner.nextInt();
//        if (length * width < parts || width > parts && length > parts
//                || parts % width != 0 && parts % length != 0) {
//            System.out.println("NO");
//        } else {
//            System.out.println("YES");
//        }
//    }


//    public static void res() {
//        Scanner scanner = new Scanner(System.in);
//        int amount = scanner.nextInt();
//        int max = 0;
//        for (int i = 0; i < amount; i++) {
//            int num = scanner.nextInt();
//            max = num % 4 == 0 ? Math.max(num, max) : max;
//        }
//        System.out.println(max);


//        int begin = scanner.nextInt();
//        int end = scanner.nextInt();
//        int count = 0;
//        double sum = 0;
//        for (int i = begin; i <= end; i++) {
//            if (i % 3 == 0) {
//                sum += i;
//                count++;
//            }
//        }
//        System.out.println(sum / count);




//        int i = -1;
//        int count = 0;
//        while (i != 0) {
//            i = scanner.nextInt();
//            count++;
//        }
//        System.out.println(count - 1);


        int i = 1;
        int compare = 0;
        boolean res = true;
        while (i != 0){
            i = scanner.nextInt();
            if (i > compare){
                compare = i;
            }else {
                res = false;
                break;
            }
        }
    }
}