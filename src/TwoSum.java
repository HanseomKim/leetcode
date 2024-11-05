import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {0,2,4,0};
        int target = 0;
        int[] result = twoSum(nums, target);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
            int key = target - nums[i];
            map.put(key, i);
        }

        // 해답이 없는 경우 빈 배열 반환
        return new int[0];
    }
}
