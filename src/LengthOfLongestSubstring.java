import java.util.*;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdfdfdfdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int start = 0;

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }

            map.put(c, i);
            max = Math.max(max, i - start + 1);
        }

        return max;
    }

}
