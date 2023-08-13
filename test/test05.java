package test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test05 {
    /**
     *  YYYY/MM/dd HH:MM:SS 의 시간포맷을 가진 로그 배열이 주어졌을때 해당 시간 포맷의 시간이 몇시에 가장 ㅁ낳이 찍혔는지
     *   2021/03/04 21:00:00
     *   2021/03/01 21:05:00
     *   2021/02/04 23:05:00
     */

    public static void main(String[] args){
        String sample = "2021/03/04 21:00:00\n"+
                "2021/03/01 21:05:00\n" +
                "2021/03/04 23:25:00";

        String retrunResult = "";

        System.out.println("Start");
        retrunResult = solution(sample);
//        System.out.println(retrunResult);
        System.out.println("END");

    }

    public static String solution(String sample){
        String result="";
        String[] sampleList = sample.split("\n");

        for(int i=0; i<sampleList.length;i++){
//            System.out.println(sampleList[i]);
            Calendar c =  calculateHour(sampleList[i],0);

            System.out.println(c.get(Calendar.HOUR_OF_DAY));

        }
        return result;
    }

    public static Calendar calculateHour(String sampleTime,int plusHour){

        DateFormat formatt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Calendar calen = Calendar.getInstance();
        try{
            calen.setTime(  formatt.parse(sampleTime));

        }catch (Exception e)
        {
            e.printStackTrace();
        }
//        calen.add( Calendar.HOUR_OF_DAY, plusHour);


        return calen;

    }
}
