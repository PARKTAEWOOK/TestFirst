package test;

import java.util.*;

public class programmers1_1 {

    // 완주 하지 못한 선수
    // ["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
    //["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
    //["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"

    public static void main(String[] args){
// ["leo", "kiki", "eden"]    ,  ["eden", "kiki"]     , "leo"


     String[]  participant1 = {"leo", "kiki", "eden"};
     String[]  completion1 = {"eden", "kiki"};


     String[]  participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
     String[]  completion2 = {"josipa", "filipa", "marina", "nikola"};   // "vinko"


     String[]  participant3 = {"mislav", "stanko", "mislav", "ana"};
     String[]  completion3 = {"stanko", "ana", "mislav"};   // "mislav"


//        System.out.println("찾았따따ㄸ따"+solution(participant1 ,completion1));
//        System.out.println("찾았따따ㄸ따"+solution3(participant3 ,completion3));
        System.out.println("찾았따따ㄸ따"+solution4(participant3 ,completion3));
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
