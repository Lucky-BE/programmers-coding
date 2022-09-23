package Level1.CaesarsPassword;

import java.util.Arrays;

//시저암호
public class Solution {
    public static String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            char tmp = (char)(c + n);
            if(c == ' '){
                sb.append(" ");
                continue;
            }
            if(Character.isLowerCase(c)){
                if(tmp > 'z') {
                    sb.append((char) (tmp - 26));
                }else {
                    sb.append(tmp);
                }
            } else {
                if (tmp > 'Z') {
                    sb.append((char) (tmp - 26));
                }else {
                    sb.append(tmp);
                }
            }
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("AB",1));
        System.out.println(solution("z",1));
        System.out.println(solution("a B z",4));
    }
}
