import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int result = 0;
        while (scanner.hasNext()) {
            sum += scanner.nextInt();
        }

        if (sum % 2 == 0) {
            result = sum / 2;
        } else {
            result = (int) Math.ceil(sum / 2);
        }
        System.out.println(result);
    }
}
