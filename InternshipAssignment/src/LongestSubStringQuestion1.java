import java.util.*;

public class LongestSubStringQuestion1 {
    public static void main(String[] args) {
        String input = "Welcome to PowerRouter";
        String longestSubstring = LongestSubstr(input);
        System.out.println("Longest Substring:" + longestSubstring);
    }

    public static String LongestSubstr(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        while (end < s.length()) {
            char currentChar = s.charAt(end);

            if (!charSet.contains(currentChar)) {
                charSet.add(currentChar);
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                charSet.remove(s.charAt(start));
                start++;
            }
        }
        return s.substring(start, start + maxLength);
    }
}
