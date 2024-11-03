public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(rotateString(s, goal));
    }

    private static boolean rotateString(String s, String goal) {
        // 두 문자열의 길이가 다르면 false 반환
        if (s.length() != goal.length()) {
            return false;
        }

        // s를 두 번 연결한 문자열 생성
        String doubledS = s + s;

        // doubledS에 goal이 포함되어 있는지 확인
        return doubledS.contains(goal);
    }
}
