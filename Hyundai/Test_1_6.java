package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_1_6 {
  public static void main(String[] args) throws IOException, ParseException {
    int answer=0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] timesArrays = new String[5];

    for(int i=0; i<5; i++){
      timesArrays[i] = reader.readLine();
    }

    SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
    for(int i=0; i<timesArrays.length; i++){
      String[] timesArray = timesArrays[i].split(" ");

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

  }
}
