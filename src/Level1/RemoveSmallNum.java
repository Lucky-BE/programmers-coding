package Level1;

import java.util.Arrays;

public class RemoveSmallNum {
    public static int[] solution(int[] arr){
        int len = arr.length;
        if(len == 1) {
            return new int[] {-1};
        }
        int[] answer = new int[len-1];
        int min = arr[0];
        System.out.println(min);
        for(int i = 0; i <len; i++) {
            if(min > arr[i]) {
                min = arr[i];
                System.out.println(min);
            }
        }

        for(int i = 0, j=0; i < len; i++) {
            if(arr[i] != min) {
                answer[j] = arr[i];
                j++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(solution(new int[]{10})));
    }
}
