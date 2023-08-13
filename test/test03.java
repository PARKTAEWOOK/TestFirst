package test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test03 {
    /**
    *  +82-10-XXXX-XXXX
     *  010-XXXX-XXXX
     *  010XXXXXXXX
    * */
    public static void main(String[] arg){
        System.out.println(solution("+82-10-9283-2871"));
        System.out.println(solution("010-9283-2871"));
        System.out.println(solution("01092832871"));
    }

    public static int solution(String sample){
        int resultValue = 0;

        String patern1 = "^+82-10-\\d{4}-\\d{4}$";
        String patern2 = "^010-\\d{4}-\\d{4}$";
        String patern3 = "^010\\d{8}$";
        System.out.println(Pattern.matches(patern3,sample));
        if( Pattern.matches(patern1,sample) ){
            resultValue = 1;
        }

        if( Pattern.matches(patern2,sample)  ){
            resultValue = 2;
        }

        if( Pattern.matches(patern3,sample)  ){
            resultValue = 3;
        }

        return resultValue;
    }
}
