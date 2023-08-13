package ProgrammersTest.Level1;

public class Test1_11 {
//    단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//          재한사항
//    s는 길이가 1 이상, 100이하인 스트링입니다.
//    입출력 예
//              s	return
//            "abcde"	"c"
//            "qwer"	"we"
    public static void main(String[] args){
        System.out.println(solution("abcde"));
    }

    public static String solution(String s) {
        String answer = "";

        //짝수와 홀수인 경우로 나누어서 정리한다! 짝수면 2글자가 나오고 홀수면 1글자가 나올 것이다.
        if(s.length()%2==0) {
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        } else {
            answer = s.substring(s.length()/2,s.length()/2+1);
        }

        return answer;
    }
}
