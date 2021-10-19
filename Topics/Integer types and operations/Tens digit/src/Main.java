import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = Long.valueOf(scanner.nextLine());
        System.out.println((number % 100) / 10);
    }
}
