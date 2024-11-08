public class LargestCombination {
    public static void main(String[] args) {
        System.out.println(largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14}));
    }

    public static int largestCombination(int[] candidates) {
        int maxCount = 0;

        // 10^7
        for (int i = 0; i < 24; i++) {
            int count = 0;
            for (int num : candidates) {
                if ((num & (1 << i)) != 0) {
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

}
