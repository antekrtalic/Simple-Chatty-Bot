import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersLength = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= numbersLength; i++) {
            int current = scanner.nextInt();
            if (i == 1) {
                continue;
            }

            if (current % 6 == 0) {
                sum += current;
            }
        }

        System.out.println(sum);
    }
}