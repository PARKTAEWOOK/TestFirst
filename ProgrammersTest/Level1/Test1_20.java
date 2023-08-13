package ProgrammersTest.Level1;

public class Test1_20 {
    public static void main(String[] args){

        System.out.println(solution(3));
    }

    public static String solution(int n) {
        String answer = "";

        for(int i=1; i<=n; i++){
            System.out.println(i%2);
            if(i%2==1){
                answer += "수";
            }else{
                answer += "박";
            }
        }
        return answer;
    }
}
