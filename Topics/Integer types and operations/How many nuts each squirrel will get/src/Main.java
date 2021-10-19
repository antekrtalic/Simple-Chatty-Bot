import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int squirel = Integer.valueOf(scanner.nextLine());
        int nuts = Integer.valueOf(scanner.nextLine());
        System.out.println(nuts / squirel);
    }
}
