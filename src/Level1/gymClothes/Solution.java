package Level1.gymClothes;

import java.util.Arrays;

public class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        //n : 총학생 수, lost : 잃어버린 학생 수, reserve : 여벌 가져온 학생 수
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int haveDo = n - lost.length; // 체육할 수 있는 학생 수

        //체육복을 도난 당했지만 여분이 있을 경우 미리 제거
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    haveDo++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            //이미 체육복을 받았을 경우 넘어감
            if (lost[i] == -1) {
                continue;
            }
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] - 1 == lost[i]) {
                    haveDo++;
                    lost[i] = -1;
                    reserve[j] = -1;
                } else if (reserve[j] + 1 == lost[i]) {
                    haveDo++;
                    lost[i] = -1;
                    reserve[j] = -1;
                }
                if (lost[i] == -1) {
                    break;
                }
            }
        }
        return haveDo;
    }

    public static void main(String[] args) {
        System.out.println("answer = " + solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println("answer = " + solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println("answer = " + solution(3, new int[]{3}, new int[]{1}));
    }
}
