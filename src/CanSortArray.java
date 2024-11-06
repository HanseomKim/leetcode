public class CanSortArray {
    public static void main(String[] args) {
        System.out.println(canSortArray(new int[]{8, 4, 2, 15, 30}));
        System.out.println(canSortArray(new int[]{1, 2, 3, 4, 5}));
    }

    public static boolean canSortArray(int[] nums) {
        int bitCount = Integer.bitCount(nums[0]);
        int prevMax = -1;
        int curMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Integer.bitCount(nums[i]) != bitCount) {
                bitCount = Integer.bitCount(nums[i]);
                prevMax = Math.max(curMax, prevMax);
                curMax = nums[i];
            } else {
                curMax = Math.max(curMax, nums[i]);
            }
            if (prevMax != -1 && nums[i] < prevMax) return false;
        }
        return true;
    }
}
