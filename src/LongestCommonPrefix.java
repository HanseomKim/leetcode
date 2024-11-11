public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));

    }

    static String longestCommonPrefix(String[] strs) {
        // 최소 문자열 길이 구하기
        int minSize = Integer.MAX_VALUE;
        for (String s : strs) {
            minSize = Math.min(minSize, s.length());
        }

        for (int i = 0; i < minSize; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(strs[0].substring(0, i + 1))) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0].substring(0, minSize);
    }
}
