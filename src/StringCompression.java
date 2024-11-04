public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compressedString("abcde"));
    }

    private static String compressedString(String word) {
        if (word == null || word.isEmpty()) {
            return "";
        }

        char[] chars = word.toCharArray();
        StringBuilder result = new StringBuilder();
        int count = 1;
        char current = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == current && count < 9) {
                count++;
            } else {
                result.append(count).append(current);
                current = chars[i];
                count = 1;
            }
        }

        result.append(count).append(current);
        return result.toString();
    }
}
