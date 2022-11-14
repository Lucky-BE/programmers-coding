package Level1;

public class PandYInTheString {
    static boolean solution(String s) {
        int p = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                y++;
            } else if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                p++;
            }
        }
        return p == y;
    }

    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }
}
