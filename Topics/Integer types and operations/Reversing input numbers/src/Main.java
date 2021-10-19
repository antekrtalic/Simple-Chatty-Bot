import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstToSecond = scanner.next();
        String secondToFirst = scanner.next();
        System.out.println(secondToFirst + " " + firstToSecond);
    }
}
