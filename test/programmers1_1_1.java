package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class programmers1_1_1 {

    public static void main(String[] args){


            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            int b = a.length();

            if(b >= 1 && b <= 1000000) {
                System.out.println(a);
            }

    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<Integer ,String> participantMap = new HashMap<>();
        HashMap<Integer ,String> completionMap = new HashMap<>();
        int key = 0;
        for(int i = 0; i < participant.length ; i++ ){
            participantMap.put(i, participant[i]);
        }

        for(int i = 0; i < completion.length ; i++ ){
            completionMap.put(i, completion[i]);
        }
        Iterator<Integer> ite = participantMap.keySet().iterator();
        while (ite.hasNext()){
            System.out.println("검색할 "+participantMap.get(key));
            if(completionMap.containsValue(participantMap.get(key))){
//                System.out.println("삭제되는  "+participantMap.get(key)   +    "    "   + key);
                participantMap.remove(key);
                ;
            }
            key++;
            if(participantMap.get(key) == null){
//                System.out.println("삭제 끝 나고 난뒤   "+participantMap.values());
                answer = participantMap.values().toString();
                break;
            }
//            System.out.println("삭제 끝 나고 난뒤   "+participantMap);
        }




        return answer;
    }


    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        boolean findComparingText = false;
        int partLength = participant.length;


        for(int i=0; i < partLength; i++){
            String searchTest = participant[i];
            for(int j=0; j<completion.length; j++){
                if(searchTest.equals(completion[j])){
                    completion[j] = "";
                    findComparingText = true;
                    break;
                }
            }

            if (findComparingText){
                findComparingText = false;
                continue;
            }
            else{
                answer =  searchTest;
                break;
            }


        }
        return answer;
    }

    public static String solution3(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for ( i=0; i<completion.length; i++){
            System.out.println(participant[i]);
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }

    public static String solution4(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) {
            System.out.println( "player : " +  player);
            hm.put(player, hm.getOrDefault(player, 0) + 1);

        }
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        System.out.println(hm);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
