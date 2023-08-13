package ProgrammersTest.Level1;

public class Test1_21 {
    public static void main(String[] args){

    }
    public static String solution(String phone_number) {
        StringBuilder answer = new StringBuilder(phone_number);

        for(int i = 0; i < phone_number.length()-4; i++) {
            answer.setCharAt(i, '*');
        }
        return answer.toString();
    }


}
