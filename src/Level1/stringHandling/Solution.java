package Level1.stringHandling;

//문자열 다루기
public class Solution {
    public static boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i < s.length(); i++) {
                if(!Character.isDigit(s.charAt(i))){
                    return false;
                }
            }
        }else{
            return false;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }
}
