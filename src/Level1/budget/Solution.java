package Level1.budget;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int max = 0, sum = 0, cnt = 0;
        for(int i = 0; i < d.length; i++){
            if (budget >= sum + d[i]) {
                ;sum += d[i];
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
