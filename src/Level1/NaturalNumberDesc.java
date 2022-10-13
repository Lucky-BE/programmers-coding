package Level1;

import java.util.*;

//자연수 뒤집어 배열로 만들기
public class NaturalNumberDesc {
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
