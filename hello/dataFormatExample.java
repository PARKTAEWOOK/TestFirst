package hello;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dataFormatExample {

    public static void main(String[] args){
        DateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:MM:ss");

        Calendar current = Calendar.getInstance();

        System.out.println(current.getTime());
        System.out.println(Calendar.HOUR_OF_DAY);
        System.out.println(Calendar.WEEK_OF_YEAR);



    }
}
