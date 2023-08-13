package ProgrammersTest.Level1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test1_2 {

//
//    다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
//
//          1478 → "one4seveneight"
//        234567 → "23four5six7"
//        10203 → "1zerotwozero3"
//    이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
//
//    참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.

//             "one4seveneight"	1478
//            "23four5six7"	234567
//            "2three45sixseven"	234567
//            "123"	123
    public static void main(String[] args){

        System.out.println(solution2("1zerotwozero3"));
    }

    public static int solution(String s) {
        int answer = 0;

        char[] arr = s.toCharArray();
        char[] number ={'1','2','3','4','5','6','7','8','9'};

        for(char o : arr){
//            if()
        }
        System.out.print(Arrays.toString(arr));
        return answer;
    }

    public static int solution2(String s) {
        int answer = 0;

        String[] numArr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<numArr.length; i++){
            //replace([기존문자],[바꿀문자])

            System.out.println(Integer.toString(i));
            System.out.println(numArr[i]);
            s = s.replaceAll(numArr[i], Integer.toString(i));
        }

        return Integer.parseInt(s);
    }
}

