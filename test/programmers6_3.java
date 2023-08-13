package test;

public class programmers6_3 {
//    어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
//
//    예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
//
//    문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
//
//    제한 조건
//    number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.
//            k는 1 이상 number의 자릿수 미만인 자연수입니다.
//            입출력 예
//    number	k	return
//      "1924"	2	"94"
//      "1231234"	3	"3234"
//     "4177252841"	4	"775841"
    public static void main(String[] agrs){

        String num1 = "1924";
        String num2 = "1231234";
        String num3 = "4177252841";

        int k1 = 2;
        int k2 = 3;
        int k3 = 4;

        System.out.println(solution(num2,k2));
    }

    public static String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int cnt = number.length() - k ;
        System.out.println("cnt  "+ cnt);
        int left = 0;
        int right = number.length() - cnt;
        System.out.println("right  "+ right);
        int max = -1;
        int idx =0;

        while (cnt>0){
            max = -1;

            for(int j=left ; j <=right ; j++){
                int num = number.charAt(j) - '0';
//                1231234
                System.out.println("j  "+j);
                System.out.println("dddd"+(number.charAt(j) - '0'));
                if(num > max){
                    idx = j;
                    System.out.println("idx   "+idx);
                    max = num;
                }
            }
            System.out.println("while in number.charAt(idx)  "+ number.charAt(idx));
            sb.append(number.charAt(idx));
            left = idx + 1;
            right = number.length() - --cnt;
            System.out.println("while in right  "+ right);
            System.out.println("while in left  "+ left);
        }

        return sb.toString();
    }
}
