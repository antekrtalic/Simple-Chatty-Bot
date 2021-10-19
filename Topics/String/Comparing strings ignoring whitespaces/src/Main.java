import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String newFirst = firstWord.replaceAll(" ", "");
        String newSecond = secondWord.replaceAll(" ", "");
        
        System.out.println(newFirst.equals(newSecond));
    }
}
