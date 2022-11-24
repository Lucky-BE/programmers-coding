package Level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DartsGame {
    public static int solution(String dartResult) {
        int score = 0;
        String[] dartResults = dartResult.split("");
        Map<String, Integer> area = new HashMap<>();

        area.put("S", 1);
        area.put("D", 2);
        area.put("T", 3);
        area.put("*", 2);
        area.put("#", -1);

        Stack<Integer> stackScore = new Stack<>();
        int cnt = 0;
        for (int i = 0; i < dartResults.length; i++) {
            if(isNumeric(dartResults[i])) {
                int prev = Integer.parseInt(dartResults[i]);
                if(prev == 1 && isNumeric(dartResults[i+1])){
                    prev = 10;
                    i = i + 1;
                }
                stackScore.push(prev);
                cnt++;
            } else {
                int tmp1;
                int tmp2;
                switch (dartResults[i]) {
                    case "S":
                        tmp1 = stackScore.pop();
                        stackScore.push(tmp1);
                        break;
                    case "D":
                        tmp1 = stackScore.pop();
                        tmp1 = tmp1 * tmp1;
                        stackScore.push(tmp1);
                        break;
                    case "T":
                        tmp1 = stackScore.pop();
                        tmp1 = tmp1 * tmp1 * tmp1;
                        stackScore.push(tmp1);
                        break;
                    case "*":
                        if(cnt == 1) {
                            tmp1 = stackScore.pop();
                            tmp1 = tmp1 * 2;
                            stackScore.push(tmp1);
                        } else {
                            tmp1 = stackScore.pop();
                            tmp2 = stackScore.pop();
                            tmp1 = tmp1 * 2;
                            tmp2 = tmp2 * 2;
                            stackScore.push(tmp2);
                            stackScore.push(tmp1);
                        }
                        break;
                    case "#":
                        tmp1 = stackScore.pop();
                        tmp1 =  tmp1 * -1;
                        stackScore.push(tmp1);
                        break;
                }
            }
        }
        for(int n : stackScore) {
            score = score + n;
        }

        return score;
    }

    static boolean isNumeric(String s){
        return s.chars().allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
        System.out.println(solution("1D2S#10S"));
        System.out.println(solution("1D2S0T"));
        System.out.println(solution("1S*2T*3S"));
        System.out.println(solution("1D#2S*3S"));

    }
}
