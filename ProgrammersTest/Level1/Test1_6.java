package ProgrammersTest.Level1;

import java.util.*;

public class Test1_6 {

//    정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
//    numbers	result
//  [2,1,3,4,1]	[2,3,4,5,6,7]
//   [5,0,2,7]	[2,5,7,9,12]

//    입출력 예 #1
//
//            2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
//            3 = 2 + 1 입니다.
//            4 = 1 + 3 입니다.
//            5 = 1 + 4 = 2 + 3 입니다.
//            6 = 2 + 4 입니다.
//            7 = 3 + 4 입니다.
//            따라서 [2,3,4,5,6,7] 을 return 해야 합니다.
//    입출력 예 #2
//
//            2 = 0 + 2 입니다.
//            5 = 5 + 0 입니다.
//            7 = 0 + 7 = 5 + 2 입니다.
//            9 = 2 + 7 입니다.
//            12 = 5 + 7 입니다.
//            따라서 [2,5,7,9,12] 를 return 해야 합니다.


    // HashSet

//    HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode()메소드를 호출해서 해시 코드를 얻어낸 다음 저장되어 있는 객체들의 해시 코드와 비교한 뒤 같은 해시 코드가 있다면
//    다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않습니다.

//    자바의 더블콜론은 위 람다식을 아래와 같이 더욱 간결하게 해준다
//
//    즉 람다식이 이미 존재하는 메소드와 동일한 기능이면 메소드 레퍼런스로 람다식을 대체할 수 있다.

//    2. 더블콜론의 사용처
//    사용하는 람다식이 기존에 있는 인스턴스의 메소드와 동일하면 메소드 레퍼런스로 대체 가능하다
//    스태틱 메소드, 인스턴스의 메소드의 메소드 레퍼런스로 사용가능하다
    public static void main(String[] args){
        int[] numbers = {2,1,3,4,1};
        solution(numbers);

        List<String> list = List.of("A","B","C");
//        list.forEach(item -> System.out.println(item));
//
//        list.forEach(System.out::println);
    }

    public static int[] solution(int[] numbers) {

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        set.stream().sorted().forEach(a-> System.out.println(a));


//        System.out.println(set.stream().sorted().mapToInt(Integer::intValue).toArray().toString());
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1;j<numbers.length; j++){
                int a = numbers[i]+numbers[j];
                if (list.indexOf(a) < 0){
                    list.add(a);
                }
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        for(int j : answer){
            System.out.println(j);
        }
        return answer;
    }

    public static int[] solution3(int[] numbers) {
        int[] answer = {};
        return answer;
    }

}
