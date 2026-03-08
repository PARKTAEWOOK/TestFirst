package ProgrammersTest.Level1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test1_11 {
//    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//          재한사항
//    s는 길이가 1 이상, 100이하인 스트링입니다.
//    입출력 예
//              s	return
//            "abcde"	"c"
//            "qwer"	"we"
    public static void main(String[] args){
        System.out.println(solution("abcde"));
    }

    public static String solution(String s) {
        String answer = "";

        //짝수와 홀수인 경우로 나누어서 정리한다! 짝수면 2글자가 나오고 홀수면 1글자가 나올 것이다.
        if(s.length()%2==0) {
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        } else {
            answer = s.substring(s.length()/2,s.length()/2+1);
        }
        String DEFAULT_START_DATE = DateUtils.getDateToString(LocalDate.now().minusDays(4), "yyyyMMdd000000");
         String DEFAULT_END_DATE = DateUtils.getDateToString(LocalDate.now().minusDays(4), "yyyyMMdd235959");
        LocalDate date = LocalDate.now().minusDays(4);
        LocalDateTime endDateTime = date.atTime(23, 59, 59);

        System.out.println(DEFAULT_START_DATE + " " + DEFAULT_END_DATE);
        System.out.println( " " + endDateTime);


// 원하는 포맷으로 변환 (yyyy-MM-dd HH:mm:ss)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = endDateTime.format(formatter);

        System.out.println(formattedDate); // 예: 2025-04-20 23:59:59

//        LocalDateTime start = LocalDateTime.parse(DEFAULT_START_DATE);
//        LocalDateTime end = LocalDateTime.parse(DEFAULT_END_DATE);
//        System.out.println(start + " " + end);
        return answer;
    }
}
 class DateUtils {
    // LocalDateTime 타입 시, 분,초를 포매팅하여 반환.
    public static LocalDateTime getLocalDateTimeWithFormatting(LocalDateTime localDateTime, String format) {
        DateTimeFormatter formatter = getDateTimeFormatter(format);
        return LocalDateTime.parse(localDateTime.format(formatter), formatter);
    }

    // String 타입 시, 분을 포매팅하여 반환
    public static LocalDate getStringToDate(String date, String format) {
        DateTimeFormatter formatter = getDateTimeFormatter(format);
        return LocalDate.parse(date, formatter);
    }

    // String 타입 시, 분을 포매팅하여 반환
    public static LocalDateTime getStringToDateTime(String date, String format) {
        DateTimeFormatter formatter = getDateTimeFormatter(format);
        return LocalDateTime.parse(date, formatter);
    }

    private static DateTimeFormatter getDateTimeFormatter(String format) {
        return DateTimeFormatter.ofPattern(format);
    }

    public static String getDateTimeToString(LocalDateTime localDateTime, String format) {
        return localDateTime.format(getDateTimeFormatter(format));
    }

    public static String getDateToString(LocalDate localDate, String format) {
        return localDate.format(getDateTimeFormatter(format));
    }

    public static LocalDateTime convertDateStringToMinDateTime(String date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate localDate = LocalDate.parse(date, formatter);
        return LocalDateTime.of(localDate, LocalTime.MIN);
    }

    public static LocalDateTime convertDateStringToMaxDateTime(String date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate localDate = LocalDate.parse(date, formatter);
        return LocalDateTime.of(localDate, LocalTime.MAX);
    }
}
