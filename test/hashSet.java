package test;

import java.util.Arrays;
import java.util.HashSet;

public class hashSet {

  public static void main(String[] args) {
    String[] array1 = {};
    String[] array2 = {"banana", "cherry", "elderberry", "fig"};

    // 배열을 HashSet으로 변환
    HashSet<String> set1 = new HashSet<>(Arrays.asList(array1));
    HashSet<String> set2 = new HashSet<>(Arrays.asList(array2));

    // 전체 집합을 설정 (예를 들어 모든 가능한 값이 "apple", "banana", "cherry", "date", "elderberry", "fig")
    HashSet<String> universalSet = new HashSet<>(Arrays.asList("apple", "banana", "cherry", "date"));
    set1.removeAll(set1);
    System.out.println(set1.toString().replaceAll("[\\[\\]]",""));
    if(!set1.isEmpty()){
      System.out.println("fdsfsd");
    }
    // set1의 여집합 (전체 집합에서 set1을 뺌)
    HashSet<String> complement1 = new HashSet<>(set1);
    complement1.removeAll(set1);

    // set2의 여집합 (전체 집합에서 set2를 뺌)
    HashSet<String> complement2 = new HashSet<>(universalSet);
    complement2.removeAll(set2);

    System.out.println(" 어ㅏㅁ어ㅏㅣㄹ ");
//        if(!complement1.isEmpty()){
    if(complement1.size() !=0){
      System.out.println( "ddd :" +complement1.toString());
    }
  }
}
