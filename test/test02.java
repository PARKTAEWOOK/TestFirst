package test;

public class test02 {

    public static void main(String[] args){

        String question = "abcba";
        System.out.print( soultion(question) );

    }

    public static boolean soultion(String sample){
        boolean resultValue = true;

        String evenOdd = sample.length()%2 == 0 ?  "even" : "odd"  ;

//        if("even".equals(evenOdd)){
//            resultValue = evenCalculation(sample);
//        }
//        else{
//            resultValue = oddCalculation(sample);
//        }
        resultValue  =  finalSoultion(sample);
        System.out.println(evenOdd);


        return resultValue;
    }

    public static boolean evenCalculation(String sample){
        boolean evenCalculationResultValue = true;

        int middleLength = sample.length()/2;

        for(int i=0; i<middleLength; i++){
            evenCalculationResultValue =  sample.substring(i,i+1).equals(sample.substring(sample.length()-(i+1),sample.length()-i));
            System.out.println(sample.substring(i,i+1));
            System.out.println(sample.substring(sample.length()-(i+1),sample.length()-i));
        }

        return evenCalculationResultValue;

    }

    public static boolean oddCalculation(String sample){
        boolean evenCalculationResultValue = true;

        int middleLength = sample.length()/2 ;
        System.out.println(middleLength); // 3

        for(int i=0; i<middleLength-1; i++){
            evenCalculationResultValue =  sample.substring(i,i+1).equals(sample.substring(sample.length()-(i+1),sample.length()-i));
            System.out.println(sample.substring(i,i+1));
            System.out.println(sample.substring(sample.length()-(i+1),sample.length()-i));
        }

        return evenCalculationResultValue;

    }

    public static boolean finalSoultion(String sample){
        boolean finalSoultionResultValue = false;
        int middleLength = sample.length()/2 ;

        String s1 = sample.substring(0,middleLength);
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder(sample.substring(sample.length()-middleLength, sample.length())).reverse();
        System.out.println(s2);
        if(s1.equals(s2.toString())){
            finalSoultionResultValue = true;
        }

        return finalSoultionResultValue;
    }
}
