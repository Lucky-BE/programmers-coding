package Level1;

public class HidePhoneNum {
    public static String solution(String phone_number) {
        int len = phone_number.length();
        String fst = phone_number.substring(0,(len - 4));
        String lst = phone_number.substring(len-4,len);
        String fst_temp ="";
        for(int i =0; i < fst.length();i++) {
            fst_temp = fst_temp.concat("*");
        }
        return fst_temp + lst ;
    }

    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }
}
