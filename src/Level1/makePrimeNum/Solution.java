package Level1.makePrimeNum;

public class Solution {
    public static int solution(int[] nums) {
        int len = nums.length, value, cnt = 0, m;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    value = nums[i] + nums[j] + nums[k];
                    for (m = 2; m <= value / 2; m++) {
                        if (value % m == 0) {
                            break;
                        }
                    }
                    if (m > value / 2) {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4}));
        System.out.println(solution(new int[] {1,2,7,6,4}));
    }
}
