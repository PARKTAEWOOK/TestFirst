package test;

public class test01 {

    /**
     *
     * ABCD, CDA두개의 문자열이 있을때
     * 양옆으로 겹치는건 한문자열로 표현할수 있다.
     * ABCDA, CDABCD 이중 가장 길게 표현할 수 있는 문자열은 ?
     *
     * */
    public static void main(String[] args){

        System.out.println("결과 값1 "+soultion("xyZA","ABCxy"));
        System.out.println("결과 값2 "+soultion("xyZA1","xyZA123"));
    }

    public static String soultion(String sample1, String sample2){

        String resultValue = "";

        if(sample1.equals(sample2)){
            return sample1;
        }
        else if(sample1.contains(sample2) || sample2.contains(sample1)) {
            return sample2.length() > sample1.length() ? sample2 : sample1;
        }

        int shortestLength = sample1.length() > sample2.length() ? sample2.length() : sample1.length();

        int maxLength1 = 0;
        int maxLength2 = 0;

        for(int i=1; i<shortestLength; i++){
            // 먼저 sample 1 + sample 2 라고 생각 하고 계산

            if(sample1.substring(0,i).equals(sample2.substring(sample2.length()-i,sample2.length()))){
                maxLength1 = i;
            }

            if(sample2.substring(0,i).equals(sample1.substring(sample1.length()-i,sample1.length()))){
                maxLength2 = i;
            }

        }

        if(maxLength1 > maxLength2){
            resultValue =  sample1 + sample2.substring(maxLength2);
        }else{
            resultValue =  sample2 + sample1.substring(maxLength1);
        }



        return resultValue;
    }
}
