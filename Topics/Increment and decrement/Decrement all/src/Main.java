import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberOne = Integer.valueOf(scanner.next());
        int numberTwo = Integer.valueOf(scanner.next());
        int numberThree = Integer.valueOf(scanner.next());
        int numberFour = Integer.valueOf(scanner.next());
        System.out.println(--numberOne + " " + --numberTwo + " " + --numberThree + " " + --numberFour);
    }
}
