import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = Integer.valueOf(scanner.next());
        int feetPerDay = Integer.valueOf(scanner.next());
        int feetPerNight = Integer.valueOf(scanner.next());
        int climbing = 0;
        
        int counter = 0;
        while (climbing < height) {
            counter++;
            climbing += feetPerDay;
            if (climbing >= height) {
                break;
            } else {
                climbing -= feetPerNight;
                
            }
            
        }
        
        System.out.println(counter);
    }
}
