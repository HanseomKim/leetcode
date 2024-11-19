import java.util.*;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{1,1,1,7,8,9}, 3));
    }

    static long maximumSubarraySum(int[] nums, int k) {
        if (nums.length < k) return 0;

        Map<Integer, Integer> countMap = new HashMap<>();
        long currentSum = 0;
        long maxSum = 0;

        // 초기 윈도우 설정
        for (int i = 0; i < k; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
            currentSum += nums[i];
        }

        if (countMap.size() == k) maxSum = currentSum;

        // 슬라이딩 윈도우
        for (int i = k; i < nums.length; i++) {
            // 윈도우에서 첫 번째 요소 제거
            int removeNum = nums[i - k];
            countMap.put(removeNum, countMap.get(removeNum) - 1);
            if (countMap.get(removeNum) == 0) countMap.remove(removeNum);
            currentSum -= removeNum;

            // 새로운 요소 추가
            int addNum = nums[i];
            countMap.put(addNum, countMap.getOrDefault(addNum, 0) + 1);
            currentSum += addNum;

            // 모든 요소가 고유하면 최대값 갱신
            if (countMap.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}
