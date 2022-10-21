package Level1;

import java.util.Arrays;

public class NumberSpaced {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0;i<n;i++) {
            if(i==0) {
                answer[i] = x;
            }else {
                answer[i] = answer[i-1] + x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));
    }
}
