import java.util.Arrays;
import java.util.Scanner;

public class AnagramStringQuestion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String1: ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter String2: ");
        String str2 = sc.nextLine().toLowerCase();
        if (str1.length() == str2.length()) {
            char[] strArr1 = str1.toCharArray();
            char[] strArr2 = str2.toCharArray();
            Arrays.sort(strArr1);
            Arrays.sort(strArr2);
            boolean result = Arrays.equals(strArr1, strArr2);
            if (result) {
                System.out.println(str1+" and "+str2+" are Anagram String");
            } else {
                System.out.println(str1+" and "+str2+" are Not Anagram String");
            }
        } else {
            System.out.println(str1+" and "+str2+" are Not Anagram String");
        }
    }
}
