package Level1;

public class AddPlaceValue {
    public static int solution(int n) {
        int sum = 0;
        int len = (String.valueOf(n)).length();
        int x = 1;
        for(int i = len; i>0; i--) {
            for(int j = 1;j<i;j++) {
                x *= 10;
            }
            sum += (n / x) % 10 ;
            x = 1;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }
}
