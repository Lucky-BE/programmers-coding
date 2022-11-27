package Level1;

import java.util.regex.Pattern;

/**
 * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
 * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
 * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
 * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
 * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
 * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
 *      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
 * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
 */

public class RecommendNewId {
    public static String solution(String new_id) {

        //1 소문자 변환
        new_id = new_id.toLowerCase();
        System.out.println("new_id1 = " + new_id);

        //2 허용문자 외 제거
        new_id = new_id.replaceAll("[^-|_|.|a-z|0-9]", "");
        System.out.println("new_id2 = " + new_id);

        //3 마침표 중복 제거
        new_id = new_id.replaceAll("\\.+", ".");
        System.out.println("new_id3 = " + new_id);

        //4 마침표가 처음이나 끝이면 제거
        new_id = step4(new_id);
        System.out.println("new_id4 = " + new_id);

        //5 빈 문자열이면 a 대입
        if(new_id.equals("")) {
            new_id = "a";
        }
        System.out.println("new_id5 = " + new_id);

        //6 길이가 16자 이상이면 15자리까지만 남기고 제거, 맨 뒤 마침표가 올 경우 마침표 제거
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0,15);
            new_id = step4(new_id);
            System.out.println("new_id6 = " + new_id);
        }

        //7 2글자 이하면, new_id 의 마지막 글자를 3이 될때 까지 반복
        if (new_id.length() <= 2) {
            StringBuilder new_idBuilder = new StringBuilder(new_id);
            for (int i = new_idBuilder.length(); i < 3; i++) {
               new_idBuilder.append(new_idBuilder.substring(new_idBuilder.length() - 1));
            }
            new_id = new_idBuilder.toString();
        }
        System.out.println("new_id7 = " + new_id);

        return new_id;
    }

    private static String step4(String new_id) {
        if(new_id.length() == 1 && new_id.charAt(0) == '.') {
            return new_id = "";
        }
        if (new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        return new_id;
    }

    public static void main(String[] args) {
        //solution("...!@BaT#*..y.abcdefghijklm");
        //solution("z-+.^.");
        //solution("=.=");
        //solution("123_.def");
        solution("a...a");

    }
}


