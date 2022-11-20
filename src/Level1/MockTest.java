package Level1;

import java.util.*;

public class MockTest {

    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] playerAnswer = new int[] {0, 0, 0 ,0};
        Map<Integer, int[]> player = new HashMap<>();
        player.put(1, new int[]{1, 2, 3, 4, 5});
        player.put(2, new int[]{2, 1, 2, 3, 2, 4, 2, 5});
        player.put(3, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});

//        int[] p1 = new int[]{1, 2, 3, 4, 5};
//        int[] p2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
//        int[] p3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        for (int i = 1; i <= 3; i++) {
            int[] playerAns = player.get(i);
            int len = playerAns.length;
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == playerAns[j % len]) {
                    playerAnswer[i]++;
                }
            }
        }
        int max = playerAnswer[0];
        for (int i = 1; i <= 3; i++) {
            if (max < playerAnswer[i]) {
                max = playerAnswer[i];
            }
        }
        Set<Integer> hs = new LinkedHashSet<>();
        for (int i = 1; i <= 3; i++) {
            if (max == playerAnswer[i]) {
                hs.add(i);
            }
        }
        answer = new int[hs.size()];
        Iterator<Integer> iter = hs.iterator();
        int n = 0;
        while (iter.hasNext()) {
            answer[n] = iter.next();
            n++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
        System.out.println(Arrays.toString(solution(new int[]{1,3,2,4,2})));
    }
}
