package Level1;

public class IntegerSqrtDistinguish {
    public static long solution(long n) {
        long answer;
        long tmp = (long) Math.sqrt(n);
        if (tmp * tmp == n) {
            answer = (tmp + 1) * (tmp + 1);
        } else {
            answer = -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }
}
