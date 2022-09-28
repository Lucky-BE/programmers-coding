package Level1.FindPrimeNum;

import java.util.Arrays;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        int[] a = new int[n+1];

        for(int i = 0; i <= n; i++) {
            a[i] = i;
        }
        a[1] = 0;
        for(int j = 2; j <= n; j++) {
            if(a[j] == 0){
                continue;
            }
            for(int k = j * 2; k <= n; k += j) {
                a[k] = 0;
            }
        }
        for (int l = 0; l <= n; l++) {
            if (a[l] != 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(5));
    }
}
