package test;

import java.util.Arrays;

public class programmers1_2 {
    public static void main(String[] args){
        String[]  completion1 = {"119", "97674223", "1195524421"};  // false
        String[]  completion2 = {"123","456","789"};   // true
        String[]  completion3 = {"12","123","1235","567","88"};   //false
        System.out.println("결과 는 : "  +  solution2(completion3));
       System.out.println("ABCD".startsWith("A",1));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        int phoneBooksLength = phone_book.length;
        answer = totallyComplite(phone_book,phoneBooksLength);
        if(!answer){
            return answer;
        }
        int firstCharLength = phone_book[0].length();
        for(int i=1; i<phoneBooksLength; i++){
            for(int j=0; j<firstCharLength; j++){
                if(phone_book[0].substring((firstCharLength-1)-j,firstCharLength).equals(phone_book[i].substring(0,j+1))){
                    answer = false;
                    break;
                }
            }

            if(!answer){
                break;
            }
        }

        return answer;
    }

    public static boolean totallyComplite(String[] phone_book, int phoneBooksLength){
        boolean answer = true;
        String compareText = phone_book[0];
        for(int i=1; i<phoneBooksLength; i++){
           if(compareText.equals(phone_book[i])){
               answer = false;
               break;
           }

        }

        return answer;
    }

    public static  boolean solution2(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);
        for(int i =0 ; i<phone_book.length-1 ; i++){
            System.out.println(phone_book[i+1]);
            System.out.println(phone_book[i]);
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }
        return answer;
    }
}
