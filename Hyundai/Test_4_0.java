package Hyundai;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;

public class Test_4_0 {


  public static LocalDate getNextTargetDate(LocalDate today) {
    // 1. 이번 주 금요일
    LocalDate thisWeekFriday = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));

    // 2. 다음 주 월요일
    LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));

    // 두 날짜 중 가장 빠른 날짜 반환
    return Arrays.asList(thisWeekFriday, nextMonday).stream()
        .min(LocalDate::compareTo)
        .orElseThrow();
  }

  public static void main(String[] args) {
    LocalDate today = LocalDate.of(2025, 9, 1);
    DayOfWeek dayOfWeek = today.getDayOfWeek();
    System.out.println(today);
    System.out.println("dayOfWeek : " + dayOfWeek);
    if (dayOfWeek == DayOfWeek.MONDAY || dayOfWeek == DayOfWeek.FRIDAY) {
      today = today.plusDays(1);
      System.out.println("When today falls on a Monday or Friday, the date is calculated as one day later : " +today);
    }
    LocalDate targetDate = getNextTargetDate(today);

    System.out.println("오늘: " + today);
    System.out.println("가장 빠른 타겟 날짜: " + targetDate);


    String yyyymmdd = "20250813"; // 변환할 날짜 문자열

    // 입력 패턴
    DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
    // 출력 패턴
    DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // 변환
    LocalDate date = LocalDate.parse(yyyymmdd, inputFormatter);
    String formattedDate = date.format(outputFormatter);

    System.out.println(formattedDate); // 2025-08-13
  }
}
