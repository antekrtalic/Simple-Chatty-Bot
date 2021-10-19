import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squirels = Integer.valueOf(scanner.next());
        int nuts = Integer.valueOf(scanner.next());
        int result = nuts % squirels;
        
        System.out.println(result);
    }
}
