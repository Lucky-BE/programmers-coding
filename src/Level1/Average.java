package Level1;

public class Average {
    public static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int a : arr) {
            answer += a;
        }

        return answer/arr.length;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{5, 5}));
    }
}
