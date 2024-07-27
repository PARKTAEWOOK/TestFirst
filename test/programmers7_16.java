package test;

public class programmers7_16 {
//    이상한 문자 만들기 https://school.programmers.co.kr/learn/courses/30/lessons/12930
//
//    제한 사항
//    문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
//    첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
//            입출력 예
//                   s	                return
//            "try hello world"	"TrY HeLlO WoRlD"
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution1(s));
    }

    public static String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] chars = word.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if((j)%2 == 0){
                    chars[j] = Character.toUpperCase(chars[j]);
                    answer += chars[j];
                }else{
                    chars[j] = Character.toLowerCase(chars[j]); //"A"
                    answer += chars[j];
                }
            }
            answer += " ";
        }
        return answer;
    }

    public static String solution1(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            System.out.println("ss: " + ss);
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            System.out.println("cnt%2 : " + cnt%2);
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
}
