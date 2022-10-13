package Level1;

//최소직사각형
public class MinRectangle {
    public static int solution(int[][] sizes) {
        int maxW = 0, maxH = 0;
        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(sizes[i][0] > maxW) {
                maxW = sizes[i][0];
            }
            if(sizes[i][1] > maxH){
                maxH = sizes[i][1];
            }
        }

        return maxH * maxW;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(solution(new int[][] {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        System.out.println(solution(new int[][] {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));



    }
}
