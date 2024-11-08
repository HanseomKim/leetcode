public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);

        if (str.startsWith("-")) return false;

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i]) return false;
        }

        return true;
        /* 성능 개선 버전
        // 음수는 팰린드롬이 될 수 없습니다.
        if (x < 0) return false;

        // 원본 숫자를 저장합니다.
        int original = x;
        int reversed = 0;

        // 숫자를 뒤집습니다.
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // 뒤집은 숫자와 원본 숫자를 비교합니다.
        return original == reversed;
        * */
    }
}
