package liveStudy.ShinsegaeTest;

import java.util.Arrays;
import java.util.HashMap;

public class ReadWriteExecute {

    public static int symbolicToOctal(String permString) {
        int returnValue = 0;
        HashMap<String,Integer> num = new HashMap<>();
        num.put("r",4);
        num.put("w",2);
        num.put("x",1);
        num.put("-",0);
        char[] d = permString.toCharArray();
        int count = 1;
        int sum = 0;
        String thressWords="";
         for(char dd :d){
             if(count < 4){
                 sum += num.get(Character.toString(dd));
                 if(count == 3){
                     thressWords += Integer.toString(sum);

                     sum=0;
                     count=0;
                 }
             }
             count++;
         }

        System.out.println(thressWords);
        return returnValue;
    }

    public static void main(String[] args) {
        // Should write 752
        System.out.println(ReadWriteExecute.symbolicToOctal("rwxr-x-w-"));
    }

}
