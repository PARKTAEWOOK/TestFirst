package test;

public class programmers7_17 {
//    핸드폰 번호 가리기 https://school.programmers.co.kr/learn/courses/30/lessons/12948

//    제한 조건
//    phone_number는 길이 4 이상, 20이하인 문자열입니다.
//    입출력 예
//    phone_number	return
//   "01033334444"	"*******4444"
//    "027778888"	"*****8888"
    public static void main(String[] args) {
        String phone = "01033334444";
        System.out.println(solution1(phone));
    }

    public static String solution(String phone_number) {
        String answer = "";
        char[] phone = phone_number.toCharArray();

        for (int i = 0; i < phone.length; i++) {
            if(i < phone.length - 4){
                answer+="*";
            }else{
                answer+=phone[i];
            }
        }

        return answer;
    }


    public static String solution1(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}
