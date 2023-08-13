package liveStudy.ShinsegaeTest;

import java.util.*;

public class TreeMapTest {

    public static void main(String[] args){
        SortedMap<String, Integer> map = new TreeMap<>((s1,s2) -> s1.length() - s2.length());
        map.put("one",7);
        map.put("two",3);
        map.put("three",10);

        map.keySet().forEach(Key -> {
            System.out.println( Key + " ->" + map.get(Key));
        });


//        Map<String, Integer> map2 = new HashMap<>();
//        map2.put("a", 3);
//        map2.put("b", 2);
//        map2.put("c", 1);
//
//        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map2.entrySet());
//        entryList.sort(Map.Entry.comparingByValue());
//        for(Map.Entry<String, Integer> entry : entryList){
//            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
//        }
//


        Map<String, Integer> map3 = new HashMap<>();
        map3.put("a", 100);
        map3.put("b", 10);
        map3.put("c", 50);
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map3.entrySet());
        entryList.sort(((o1, o2) -> map3.get(o1.getKey()) - map3.get(o2.getKey())));
        for(Map.Entry<String, Integer> entry : entryList){
            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
        }


        HashSet<String> gSet = new HashSet<String>();
        gSet.add("1");
        gSet.add("2");
        gSet.add("1");

        System.out.println(gSet.toString());


        HashMap<String, String> ht = new HashMap<String, String>();
        ht.put("Grapes", "포도");
        ht.put("Apple", "사과");
        ht.put("Strawberry", "딸기");
        ht.put("Orange", "오렌지");

        TreeMap<String,String> tm = new TreeMap<String,String>(ht);
//        Set<String> keyset = ht.keySet();
//        Iterator<String> keyiterator = tm.keySet( ).iterator( ); //키값 오름차순 정렬
         Iterator<String> keyiterator = tm.descendingKeySet().iterator(); //키값 내림차순 정렬
        String k; String v;
        while(keyiterator.hasNext()) {
            k = (String)keyiterator.next();
            v = (String)tm.get(k);
            System.out.println("키 : "+k+" ---> 값 : "+v);
        }
    }
}
