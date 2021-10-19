import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hourOne = Integer.valueOf(scanner.next());
        int minsOne = Integer.valueOf(scanner.next());
        int secsOne = Integer.valueOf(scanner.next());
        int hourTwo = Integer.valueOf(scanner.next());
        int minsTwo = Integer.valueOf(scanner.next());
        int secsTwo = Integer.valueOf(scanner.next());
        int result = ((((hourTwo * 60) + minsTwo)) * 60 + secsTwo) - (((((hourOne * 60) + minsOne)) * 60 + secsOne));
        System.out.println(result);
    }
}