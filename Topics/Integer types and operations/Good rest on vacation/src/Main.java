import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.valueOf(scanner.next());
        int foodCostPerDay = Integer.valueOf(scanner.next());
        int oneWayFlightCost = Integer.valueOf(scanner.next());
        int costOfOneNight = Integer.valueOf(scanner.next());
        int result = days * foodCostPerDay + 2 * oneWayFlightCost + (days - 1) * costOfOneNight;
        System.out.println(result);
    }
}
