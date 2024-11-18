import java.util.Arrays;

public class DefuseTheBomb {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decrypt(new int[]{2,4,9,3}, -2)));
    }

    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) return result; // k가 0이면 모든 요소가 0인 배열 반환

        int start = k > 0 ? 1 : n + k;
        int end = k > 0 ? k : n - 1;

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += code[i % n];
        }

        for (int i = 0; i < n; i++) {
            result[i] = sum;
            sum -= code[(start + i) % n];
            sum += code[(end + i + 1) % n];
        }

        return result;
    }
}
