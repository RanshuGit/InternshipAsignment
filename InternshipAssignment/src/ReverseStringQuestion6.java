import java.util.Scanner;

public class ReverseStringQuestion6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String: ");
            String str = sc.nextLine();
            String revStr = "";
            for (int i=str.length()-1; i>=0; i--) {
                revStr = revStr + str.charAt(i);
            }
            System.out.println(revStr);
        }
    }

