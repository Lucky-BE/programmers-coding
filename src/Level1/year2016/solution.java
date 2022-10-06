package Level1.year2016;

import java.util.Calendar;

public class solution {
    public static String solution(int a, int b) {
        String[] day_of_week = {"", "SUN","MON","TUE","WED","THU","FRI","SAT"};
        Calendar cal = Calendar.getInstance();
        cal.set(2016, a - 1, b);

//        System.out.println("cal = " + day_of_week[cal.get(Calendar.DAY_OF_WEEK)]);
        return day_of_week[cal.get(Calendar.DAY_OF_WEEK)];
    }

    public static void main(String[] args) {
        solution(5, 24);
    }
}
