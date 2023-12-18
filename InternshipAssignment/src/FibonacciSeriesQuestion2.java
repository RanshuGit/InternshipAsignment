import java.util.Scanner;

public class FibonacciSeriesQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit: ");
        int limit = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print(firstTerm+", ");
        System.out.print(secondTerm+", ");
        for (int i=2; i<limit; i++) {
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.print(secondTerm+", ");
        }
    }
}