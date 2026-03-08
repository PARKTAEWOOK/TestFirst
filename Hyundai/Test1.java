package Hyundai;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;

public class Test1 {
    public static void main(String[] args) {
        String[] s = {"Hyundai-Motor-Group", "Next-Generation-Vehicle"};
//
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        String[] slist = a.split("-");
        for (int i = 0; i < s.length; i++) {
            String[] slist = s[i].split("-");
            String answer = "";

            for (int j = 0; j < slist.length; j++) {
//                System.out.println(slist[j]);
                answer += slist[j].charAt(0);
            }

            System.out.println(answer);


        }

//        String workDate = "20250803";
//        Calendar calendar = Calendar.getInstance(Locale.KOREA);
//
//
//        calendar.set(Calendar.YEAR, Integer.parseInt(workDate.substring(0, 4)));
//        calendar.set(Calendar.MONTH, Integer.parseInt(workDate.substring(4, 6)) - 1);
//        calendar.set(Calendar.DATE, Integer.parseInt(workDate.substring(6, 8)));
//
//        // 주 시작 요일과 최소 일수 설정
//        calendar.setFirstDayOfWeek(Calendar.MONDAY);
//        calendar.setMinimalDaysInFirstWeek(4);
//
//        // 날짜 복사해서 주 시작 날짜 계산
//        Calendar weekStart = (Calendar) calendar.clone();
//        weekStart.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek()); // 주의 시작일로 이동
//
//        // 주 시작 날짜의 '월'로 주차 계산을 기준 삼기 위해 월을 강제로 조정
//        int baseYear = weekStart.get(Calendar.YEAR);
//        int baseMonth = weekStart.get(Calendar.MONTH); // ← 이게 6(7월)이면 7월 기준 주차로 보자
//        System.out.println("baseMonth : " + baseMonth);
//
//        Calendar base = Calendar.getInstance(Locale.KOREA);
//        base.clear(); // 모든 필드 초기화
//        base.setFirstDayOfWeek(Calendar.MONDAY);
//        base.setMinimalDaysInFirstWeek(4);
//        base.set(Calendar.YEAR, baseYear);
//        base.set(Calendar.MONTH, baseMonth);
//        base.set(Calendar.DATE, 1);
//
//        // 주차 계산
//        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
//
//        // 여기서 주차 계산 기준을 baseMonth로 정할 수 있음
//        System.out.println("기준 월 (0=1월): " + baseMonth); // → 6 = 7월
//        System.out.println("주차 (기준 월에서 계산): " + weekOfMonth);
//
//
//        // LocalDate 선언 (문자열을 날짜로 파싱)
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//        LocalDate localDate = LocalDate.parse(workDate, formatter);
//        WeekFields weekFields = WeekFields.of(DayOfWeek.MONDAY, 4);
//        int weekOfMonth11 = localDate.get(weekFields.weekOfMonth());
//
//        System.out.println("주차 (기준 월에서 계산): " + weekOfMonth11);
//


        String workDate22 = "20250905";
        Calendar calendar = Calendar.getInstance(Locale.KOREA);
        calendar.set(Calendar.YEAR, Integer.parseInt(workDate22.substring(0, 4)));
        calendar.set(Calendar.MONTH, Integer.parseInt(workDate22.substring(4, 6)) - 1);
        calendar.set(Calendar.DATE, Integer.parseInt(workDate22.substring(6, 8)));

        // 주 시작 요일과 최소 일수 설정
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.setMinimalDaysInFirstWeek(4);
        // 입력일
//        calendar.set(2025, Calendar.AUGUST, 1);

        // 주 시작일로 이동
        // 현재 요일을 숫자로 변환
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        // 현재 요일에서 주의 시작 요일인 월요일까지의 차이 계산
        int diffToMonday = (dayOfWeek + 7 - Calendar.MONDAY) % 7;
        calendar.add(Calendar.DATE, -diffToMonday);

        // 기준 달(이제는 주 시작일 기준)이 7월이면
        int adjustedYear = calendar.get(Calendar.YEAR);
        int adjustedMonth = calendar.get(Calendar.MONTH); // ← 6 = July
        int adjustedWeek = calendar.get(Calendar.WEEK_OF_MONTH);

        System.out.println("기준 년: " + adjustedYear);
        System.out.println("기준 월: " + (adjustedMonth + 1));
        System.out.println("기준 월의 주차: " + adjustedWeek);



    }

}
