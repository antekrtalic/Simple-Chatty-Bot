import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.next());
        final int hundredDigit = number / 100;
        final int tenDigit = (number % 100) / 10;
        final int oneDigit = (number % 10) % 10;
        int result = hundredDigit + tenDigit + oneDigit;
        
        System.out.println(result);
    }
}
