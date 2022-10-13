package Level1;

//이상한 문자열 만들기
public class MakingStrangeTexts {
    public static String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);
        String [] str = s.split(" ",-1);
        for(int i = 0; i < str.length; i++){
            for (int j = 0; j < str[i].length(); j++) {
                if (j % 2 == 0) {
                    sb.append(str[i].substring(j,j+1).toUpperCase());
                } else {
                    sb.append(str[i].substring(j,j+1).toLowerCase());
                }
            }
            if(i+1 == str.length){
                sb.append("");
            }else{
                sb.append(" ");
            }
        }
        answer = sb.toString();
        return answer;
    }
}
