package Level1.PickTwoAdd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    //두 개 뽑아서 더하기
    public static int[] solution(int[] numbers) {

        Set<Integer> setSum = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                setSum.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[setSum.size()];
        Iterator<Integer> iter = setSum.iterator();
        for(int i =0; i < setSum.size(); i++){
            answer[i] = iter.next();
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 4, 1}));

    }
}
