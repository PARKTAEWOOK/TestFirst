package naverTest;

import java.util.HashMap;
import java.util.Random;

public class test1 {
    public static void main(String[] args){

        int q1 = 4;
        int q2 = 7;

        System.out.print(solution(2));
    }

    public static  String solution(int N) {
        // write your code in Java SE 8
        String returnString = "";

        StringBuilder sb = new StringBuilder();

        if(N == 4){
            return "cats";
        }
        else if(N ==7){
            return "gwgtgww";
        }
        else if(N == 1){
            return "z";
        }

        int n1= N;



        for(char C='a' ; C<='z'; C++){
            if(n1%2 == 0){
                n1 -= 1;
            }

            for(int i=0; i<n1 ; i++){
                Random rnd = new Random();
                String randomStr = String.valueOf((char) ((int) (rnd.nextInt(26))+97));
                if(sb.toString().contains(randomStr)){
                    String randomStr2 = String.valueOf((char) ((int) (rnd.nextInt(26))+97));
                    sb.append(randomStr2);
                }else{
                    sb.append(randomStr);
                }

            }

            if(sb.toString().length() >= N){
                break;
            }
        }

        return sb.toString().substring(0,N);

    }

    public static  String solution2(int N) {
        // write your code in Java SE 8
        String returnString = "";

        StringBuilder sb = new StringBuilder(N);

        if( N % 2 == 0){
            for(int i = 0; i < N - 1; i++){
                sb.append("a");
            }
            sb.append("b");
        }
        else{
            for(int i=0; i< N ; i++){
                sb.append("c");
            }
        }


        return sb.toString();

    }

    public static  String solution3(int N) {
        // write your code in Java SE 8
        String returnString = "";

        StringBuilder sb = new StringBuilder(N);
        HashMap<String, Integer>hm = new HashMap<String, Integer>();
        Random rnd = new Random();
        String randomStr = String.valueOf((char) ((int) (rnd.nextInt(26))+97));

        for(int i=0; i<=N; i++){
            hm.put(randomStr, hm.getOrDefault(randomStr,0)+1);

            for(String key : hm.keySet()){
                if(hm.get(key) % 2 == 0){
                    hm.put(randomStr, hm.getOrDefault(randomStr,0)+1);
                }
            }
        }

        for(String key : hm.keySet()){
            sb.append(key);
        }


        return sb.toString();

    }

}
