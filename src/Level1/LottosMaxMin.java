package Level1;

import java.util.Arrays;

//로또의 최고순위와 최저순위
public class LottosMaxMin {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int max = 0, min = 0, none = 0, cnt = 0;
        int[] arr = {6, 6, 5, 4, 3, 2, 1};
        Arrays.sort(lottos);
        Arrays.sort(win_nums);

        for (int lotto : lottos) {
            if (lotto == 0) {
                none++;
            } else {
                for (int win_num : win_nums) {
                    if (lotto == win_num) {
                        cnt++;
                    }
                }
            }
        }
        answer[0] = arr[cnt + none];
        answer[1] = arr[cnt];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(solution(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25})));
        System.out.println(Arrays.toString(solution(new int[] {45, 4, 35, 20, 3, 9}, new int[] {20, 9, 3, 45, 4, 35})));
    }
}
