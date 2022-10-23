package Level1;

import java.util.Arrays;
import java.util.Comparator;

public class IntegerDescendingOrder {
    public static long solution(long n) {
        long answer = 0;
        String[] tmp = Long.toString(n).split("");
        Arrays.sort(tmp, Comparator.reverseOrder());
        String t = String.join("",tmp);
        answer = Long.parseLong(t);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
