import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String s = "leeetcode";
        char[] charArray = s.toCharArray();

        Queue<Character> queue = new LinkedList<>();
        queue.add(charArray[0]);
        queue.add(charArray[1]);
        for (int i=2; i<charArray.length; i++) {
//            System.out.println(charArray[i]);
            if (charArray[i] == charArray[i-1] && charArray[i] == charArray[i-2]) {
                continue;
            } else {
                queue.add(charArray[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }

        System.out.println(sb);

    }
}