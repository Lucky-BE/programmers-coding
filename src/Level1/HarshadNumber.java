package Level1;

public class HarshadNumber {
    public static boolean solution(int x) {
        String[] tmp = Integer.toString(x).split("");
        int sum = 0;
        for (int i = 0; i < tmp.length; i++) {
            sum += Integer.parseInt(tmp[i]);
        }
        return (x % sum == 0);
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }

}
