package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class programmers2_5 {
//    신고 결과 받기  https://school.programmers.co.kr/learn/courses/30/lessons/92334
//신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.
//
//    각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
//    신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
//    한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
//    k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
//    유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
//    다음은 전체 유저 목록이 ["muzi", "frodo", "apeach", "neo"]이고, k = 2(즉, 2번 이상 신고당하면 이용 정지)인 경우의 예시입니다.
//
//    id_list	                        report	                                                            k	result
//  ["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
//    ["con", "ryan"]	                ["ryan con", "ryan con", "ryan con", "ryan con"]	                3	[0,0]
    public static void main(String[] args){

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        String[] id_list1 = {"con", "ryan"};
        String[] report1 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k1 = 3;
        System.out.println(solution(id_list1,report1,k1));


    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        System.out.println(id_list.length);
        int[] answer = new int[id_list.length];

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        String[] resultArr = hashSet.toArray(new String[0]);

        HashMap<String, Integer> hm = new HashMap<>();
        HashMap<String, Integer> receive = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (String reports : resultArr) {
            System.out.println( "player : " +  reports);
            String[] reporterAndSuspect = reports.split(" ");
            System.out.println("1 " + reporterAndSuspect[0]);
            System.out.println("2 " + reporterAndSuspect[1]);
            hm.put(reporterAndSuspect[1], hm.getOrDefault(reporterAndSuspect[1],0)+1 );
        }


        for (String reports : resultArr) {
            String[] reporterAndSuspect = reports.split(" ");
            System.out.println("repoter " + reporterAndSuspect[0]);
            System.out.println("2 " + reporterAndSuspect[1]);

            receive.put(reporterAndSuspect[0],  receive.getOrDefault(reporterAndSuspect[0],0)+searchSuspect(reporterAndSuspect[1],hm,k) );
        }





        System.out.println("===== 신고 당한 횟수 ===== ");

        for(String s :  hm.keySet()){
            System.out.println( " Id : " + s + " " + hm.get(s));
        }

        for(String s :  receive.keySet()){
            System.out.println( " receive : " + s + " " + receive.get(s));
        }

        for (int i= 0; i<id_list.length; i++){
           if(receive.containsKey(id_list[i])){
             answer[i] = receive.get(id_list[i]);
           }else{
               answer[i] = 0;
           }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static int searchSuspect(String suspect, HashMap<String, Integer> gm, int k){
        System.out.println("searchSuspect : " + suspect );

        int returnValue = gm.get(suspect)>=k ? 1 : 0;
        return returnValue;
    }

    public static int[] solution2(String[] id_list, String[] report, int k) {

        List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
        HashMap<String, Integer> count = new HashMap<>();
        for (String s : list) {
            String target = s.split(" ")[1];
            count.put(target, count.getOrDefault(target, 0) + 1);
        }

        return Arrays.stream(id_list).map(_user -> {
            final String user = _user;
            List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
            return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
        }).mapToInt(Long::intValue).toArray();
    }

}
