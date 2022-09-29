package Level1.naturalNumberDesc;

import java.util.*;

public class Solution {
    public static long solution(long n) {
        long answer = 0;
        String[] tmp = Long.toString(n).split("");
        Arrays.sort(tmp, Comparator.reverseOrder());
        System.out.println("Arrays.toString(tmp) = " + Arrays.toString(tmp));
        String t = String.join("",tmp);
        answer = Long.parseLong(t);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
