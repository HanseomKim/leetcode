import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinChanges {
    public static void main(String[] args) {
        System.out.println(minChanges("1001"));
        System.out.println(minChanges("10"));
    }

    public static int minChanges(String s) {
        int changes = 0;

        // 짝수 길이로 나누어서 각 두 문자씩 비교
        for (int i = 0; i < s.length(); i += 2) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);

            // 두 문자가 다르면 하나를 바꿔야 함
            if (first != second) {
                changes++;
            }
        }

        return changes;
    }
}
