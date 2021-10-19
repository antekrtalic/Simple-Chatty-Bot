
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String language = scanner.nextLine();

        if (language.toUpperCase().startsWith("J")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
