package Level1;

//숫자 문자열과 영단어
public class NumStringEng {
    public static int solution1(String s) {
        int answer = 0;
        String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if(s.charAt(i) == '0'){
                    continue;
                } else {
                    sb2.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
                for (int j = 0; j < eng.length; j++) {
                    if (eng[0].equals(sb.toString())) {
                        continue;
                    }
                    else if (eng[j].equals(sb.toString())) {
                        sb2.append(j);
                        sb.delete(0,s.length());
                    }
                }
            }
        }
        answer = Integer.parseInt(sb2.toString());
        return answer;
    }

    public static int solution2(String s) {
        int answer = 0;
        String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < eng.length; i++) {
            s = s.replace(eng[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution2("0one4seveneight"));
        System.out.println(solution2("23four5six7"));
        System.out.println(solution2("2three45sixseven"));
        System.out.println(solution2("zero123"));
    }
}
