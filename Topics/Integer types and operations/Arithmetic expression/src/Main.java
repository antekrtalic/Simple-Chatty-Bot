import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        int result = ((n + 1) * n + 2) * n + 3;
        System.out.println(result);
    }
}
