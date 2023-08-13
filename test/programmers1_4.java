package test;

import java.util.*;

public class programmers1_4 {

    public static void main(String[] args){
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(solution2(genres,plays));
    }

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> sortGenres = new HashMap<>();
        int playsIndex = 0;
        for(String gener : genres){

            System.out.println(gener);
            System.out.println(plays[playsIndex]);
            sortGenres.put(gener, sortGenres.getOrDefault(gener,0)+plays[playsIndex]);
            playsIndex++;

        }
        System.out.println(sortGenres);

//        sortGenres.
        return answer;
    }

    public static int[] solution2(String[] genres, int[] plays) {
//        int[] answer = {};

        HashMap<Integer, Integer> pMap = new HashMap<>();
        HashMap<Integer, String> gMap = new HashMap<>();

        for(int i = 0; i<genres.length; i++){
            pMap.put(i,plays[i]);
            gMap.put(i,genres[i]);
        }

        HashSet<String> gSet = new HashSet<String>();

        for(int i = 0; i<genres.length; i++){
            gSet.add(genres[i]);
        }

        HashMap<Integer, String> coPlay = new HashMap<Integer, String>();

        for(String x : gSet){
            int count = 0;
            for(int i = 0; i < gMap.size(); i++){
                if(gMap.get(i).equals(x)){
                    count+= pMap.get(i);
                }
            }
            coPlay.put(count, x);
        }

        System.out.println("coPlay : " +coPlay);

        //플레이 횟수 별로 정렬(키 값을 기준으로 정렬, TreeMap)
        TreeMap sort = new TreeMap(coPlay);
        String[] sortGenre = new String[gSet.size()];
        int index = 0;
        for(Object o : sort.keySet()){

            sortGenre[index] = sort.get(o).toString();
            index++;
        }
        System.out.println("TreeMap     " + sort);

        //장르별 많이 플레이 된 노래의 고유번호 찾기
        ArrayList<Integer> fIndex = new ArrayList<Integer>();
        for(int i = sortGenre.length-1; i >= 0; i--){
            int count = 0;
            for(int p1 : gMap.keySet()){
                if(sortGenre[i].equals(gMap.get(p1))){
                    count++;
                }
            }

            int[] temp = new int[count];
            int k = 0;
            for(int p2 : gMap.keySet()){
                if(sortGenre[i].equals(gMap.get(p2))){
                    temp[k] = pMap.get(p2);
                    k++;
                }
            }

            if(temp.length != 1){
                Arrays.sort(temp);
                for(int j = temp.length - 1; j >= temp.length - 2; j--){
                    for(int p : pMap.keySet()){
                        if(temp[j] == pMap.get(p)){
                            fIndex.add(p);
                            pMap.put(p, 0);
                            break;
                        }
                    }
                }
            }else{
                for(int p : pMap.keySet()){
                    if(temp[0] == pMap.get(p)){
                        fIndex.add(p);
                        pMap.put(p, 0);
                        break;
                    }
                }
            }
        }

        int[] answer = new int[fIndex.size()];

        for(int i = 0; i < fIndex.size(); i++){
            System.out.println(fIndex.get(i));
            answer[i] = fIndex.get(i);
        }

        return answer;
    }
}
