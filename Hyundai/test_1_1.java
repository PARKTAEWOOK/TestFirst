package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test_1_1 {
//    근무시간 https://softeer.ai/app/assessment/index.html?xid=250330&xsrfToken=TIa6xaLSYws8JA5EfJn6Drl7TXUJAydJ&testType=practice

//    5일 동안 근무한 시간의 총 몇분을 구하시오

    public static void main(String[] args) throws IOException, ParseException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();

        System.out.println(str);
//        int totalHour =0;
//        int totalMin =0;
//        for(int i=0; i<5; i++){
//            totalHour += 9*60;
//            totalMin += 17;
//        }

//        System.out.println("totalHour="+totalHour+" totalMin="+totalMin);
        System.out.println("10 : 11 - 18 : 45 = "+  8 + " : " + 34);
        System.out.println("10 : 47 - 15 : 33 = "+  8 + " : " + 34);

        SimpleDateFormat readline = new SimpleDateFormat("HH:mm");

        // 비교할 시간 (문자열)
        String timeStr1 = "10:47";
        String timeStr2 = "11:33";

        String[] timesArray = new String[5];
        for(int i=0; i<5; i++){
            timesArray[i] = reader.readLine();
        }

        solution(timesArray);

    }

    public static int solution(String[] times) throws ParseException {
        int answer=0;
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        for(int i=0; i<times.length; i++){
            String[] timesArray = times[i].split(" ");

            // 문자열 -> Date
            Date date1 = timeFormat.parse(timesArray[0]);
            Date date2 = timeFormat.parse(timesArray[1]);

            // Date -> 밀리세컨즈
            long timeMil1 = date1.getTime();
            long timeMil2 = date2.getTime();

            // 비교
            long diff = timeMil2 - timeMil1;

            long diffMin = diff / (1000 * 60);
            answer += diffMin;
        }
        System.out.println(answer);
        return answer;
    }

}
