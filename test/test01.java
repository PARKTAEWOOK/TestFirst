package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class test01 {

    /**
     *
     * ABCD, CDA두개의 문자열이 있을때
     * 양옆으로 겹치는건 한문자열로 표현할수 있다.
     * ABCDA, CDABCD 이중 가장 길게 표현할 수 있는 문자열은 ?
     *
     * */
    public static void main(String[] args){

        System.out.println("결과 값1 "+soultion("xyZA","ABCxy"));
        System.out.println("결과 값2 "+soultion("xyZA1","xyZA123"));
    }

    public static String soultion(String sample1, String sample2){

        String resultValue = "";
        System.out.println(LocalDateTime.of(2025, 9,24,11,11).minusYears(1).plusDays(1).format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        extracted("20241028");

        if(sample1.equals(sample2)){
            return sample1;
        }
        else if(sample1.contains(sample2) || sample2.contains(sample1)) {
            return sample2.length() > sample1.length() ? sample2 : sample1;
        }

        int shortestLength = sample1.length() > sample2.length() ? sample2.length() : sample1.length();

        int maxLength1 = 0;
        int maxLength2 = 0;

        for(int i=1; i<shortestLength; i++){
            // 먼저 sample 1 + sample 2 라고 생각 하고 계산

            if(sample1.substring(0,i).equals(sample2.substring(sample2.length()-i,sample2.length()))){
                maxLength1 = i;
            }

            if(sample2.substring(0,i).equals(sample1.substring(sample1.length()-i,sample1.length()))){
                maxLength2 = i;
            }

        }

        if(maxLength1 > maxLength2){
            resultValue =  sample1 + sample2.substring(maxLength2);
        }else{
            resultValue =  sample2 + sample1.substring(maxLength1);
        }



        return resultValue;
    }

    private static void extracted(String workDate) {
        Calendar calendar = Calendar.getInstance();
//        Calendar calendar = Calendar.getInstance(Locale.KOREA);

        calendar.set(Calendar.YEAR, Integer.parseInt(workDate.substring(0, 4)));
        calendar.set(Calendar.MONTH, Integer.parseInt(workDate.substring(4, 6)) - 1);
        calendar.set(Calendar.DATE, Integer.parseInt(workDate.substring(6, 8)));
        // 한 주의 시작 요일 설정
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        // 첫 주를 계산할 때 최소로 있어야 하는 날짜 수 설정
        calendar.setMinimalDaysInFirstWeek(4);
        // 해당 월의 몇 주차인지 계산
        calendar.set(Calendar.YEAR, Integer.parseInt(workDate.substring(0, 4)));
        calendar.set(Calendar.MONTH, Integer.parseInt(workDate.substring(4, 6)) - 1);
        calendar.set(Calendar.DATE, Integer.parseInt(workDate.substring(6, 8)));

//        System.out.println("calendar = " + calendar.getTime().toString());
//        System.out.println("calendar = " + Integer.parseInt(workDate.substring(0, 4)));
//        System.out.println("calendar = " + (Integer.parseInt(workDate.substring(4, 6)) - 1));
//        System.out.println("calendar = " + Integer.parseInt(workDate.substring(6, 8)));
//        // 한 주의 시작 요일 설정
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        // 첫 주를 계산할 때 최소로 있어야 하는 날짜 수 설정
        calendar.setMinimalDaysInFirstWeek(4);
        // 해당 월의 몇 주차인지 계산
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
//        return String.valueOf(weekOfMonth);

        System.out.println("몆주차 ::: " + String.valueOf(weekOfMonth));
    }

    // 주차 정보를 가져오기 위한 함수
    private static String getWeekOfMonth() {
        Calendar calendar = Calendar.getInstance(Locale.KOREA);

        calendar.set(2024,Calendar.SEPTEMBER,19);

        System.out.println("calendar = " + calendar);
        // 한 주의 시작 요일 설정
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        // 첫 주를 계산할 때 최소로 있어야 하는 날짜 수 설정
        calendar.setMinimalDaysInFirstWeek(4);
        // 해당 월의 몇 주차인지 계산
        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
        return String.valueOf(weekOfMonth);
    }

}
