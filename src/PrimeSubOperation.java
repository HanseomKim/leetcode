import java.util.Arrays;

public class PrimeSubOperation {
    public static void main(String[] args) {
        System.out.println(primeSubOperation(new int[]{3,3,5,5}));
    }

    public static boolean primeSubOperation(int[] nums) {
        int prev = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= prev) {
                return false;
            }

            int maxSubtract = nums[i] - prev - 1;
            int subtractPrime = findLargestPrime(maxSubtract);

            nums[i] -= subtractPrime;
            prev = nums[i];
        }

        return true;
    }

    private static int findLargestPrime(int n) {
        for (int i = n; i >= 2; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return 0;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
