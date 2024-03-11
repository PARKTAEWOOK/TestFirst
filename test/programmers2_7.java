package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class programmers2_7 {
//   추억 점수 https://school.programmers.co.kr/learn/courses/30/lessons/176963

//사진들을 보며 추억에 젖어 있던 루는 사진별로 추억 점수를 매길려고 합니다. 사진 속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억 점수가 됩니다. 예를 들어 사진 속 인물의 이름이 ["may", "kein", "kain"]이고 각 인물의 그리움 점수가 [5점, 10점, 1점]일 때 해당 사진의 추억 점수는 16(5 + 10 + 1)점이 됩니다. 다른 사진 속 인물의 이름이 ["kali", "mari", "don", "tony"]이고 ["kali", "mari", "don"]의 그리움 점수가 각각 [11점, 1점, 55점]]이고, "tony"는 그리움 점수가 없을 때, 이 사진의 추억 점수는 3명의 그리움 점수를 합한 67(11 + 1 + 55)점입니다.
//
//    그리워하는 사람의 이름을 담은 문자열 배열 name, 각 사람별 그리움 점수를 담은 정수 배열 yearning, 각 사진에 찍힌 인물의 이름을 담은 이차원 문자열 배열 photo가 매개변수로 주어질 때, 사진들의 추억 점수를 photo에 주어진 순서대로 배열에 담아 return하는 solution 함수를 완성해주세요.
//
//    name	                            yearning	        photo	                                                                                            result
//    ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	    [["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]	[19, 15, 6]
//    ["kali", "mari", "don"]	        [11, 1, 55]	        [["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]]	                        [67, 0, 55]
//    ["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	    [["may"],["kein", "deny", "may"], ["kon", "coni"]]	                                                [5, 15, 0]
    public static void main(String[] args){
//        System.out.println(solution(id_list1,report1,k1));
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5,10,1,3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};

        System.out.println(solution(name,yearning,photo));
    }

    public static int[] solution(String[] names, int[] yearning, String[][] photo) {
        int[] answer = {};
        List<Integer> nameScore = new ArrayList<>();
        HashMap<String, Integer> nameAndYearing = new HashMap<>();

        for(int i=0; i<names.length; i++){

            nameAndYearing.put(names[i], yearning[i]);
        }

        for(String[] photos : photo){
            int score = 0;
           for(String photoName : photos){
               System.out.println(photoName + "  :  " + nameAndYearing.get(photoName) );
//               score += nameAndYearing.get(photoName);
               score = score + (nameAndYearing.get(photoName) == null ? 0: nameAndYearing.get(photoName));
           }
            nameScore.add(score);
        }
        System.out.println(nameAndYearing.toString());
        System.out.println(nameScore.toString());
        return nameScore.stream().mapToInt(i -> i).toArray();

    }

    public static int[] solution2(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for(int i=0; i<photo.length; i++) { // photo 요소
            for(int j=0; j<photo[i].length; j++) { // photo 요소의 요소? 뭐라 부르지;
                for(int k=0; k<name.length; k++) {
                    if(photo[i][j].equals(name[k])) answer[i] += yearning[k];
                }
            }
        }
        return answer;
    }

    public static int[] solution3(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i=0; i< name.length; i++){
            map.put(name[i],yearning[i]);
        }

        for(int i =0; i< photo.length;i++){
            String[] persons = photo[i];
            int score = 0;
            for(int j=0; j<persons.length; j++){
                String person = persons[j];
                if(map.containsKey(person)){
                    score+=map.get(person);
                }
            }
            answer[i]=score;
        }

        return answer;
    }
}
