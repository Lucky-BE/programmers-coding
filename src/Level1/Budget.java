package Level1;

import java.util.Arrays;

//예산
public class Budget {
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int max = 0, sum = 0, cnt = 0;
        for (int j : d) {
            if (budget >= sum + j) {
                sum += j;
                cnt++;
                max = cnt;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,3,2,5,4},9));
        System.out.println(solution(new int[] {2,2,3,3},10));
    }
}
