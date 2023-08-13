package naverTest;

import java.util.TreeMap;

public class test3 {
    static class PhoneNumber {
        String name;
        String number;

        PhoneNumber(String name, String number){
            this.name = name;
            this.number = number;
        }

        @Override
        public String toString() {
            return "PhoneNumber{" +
                    "name=" + name +
                    ", number=" + number +
                    '}';
        }
    }

    public static void main(String[] args){
        String[] A = {"sander", "ann","michale"};
        String[] B = {"123456789", "789123456","123123123"};
        String P = "1";

        System.out.print(solution(A,B,P));
    }

    public static String solution(String[] A, String[] B, String P) {
        String result = "";
        // write your code in Java SE 8
        TreeMap<String, String> treemap = new TreeMap<String, String>();
        for(int i = 0 ; i < A.length ; ++i){
            treemap.put(A[i], B[i]);
        }

        for(String key : treemap.keySet()){
            System.out.println("Key : " + key + "  value " + treemap.get(key) );
            if(treemap.get(key).contains(P)){
                result = key;
                break;
            }
        }

        if("".equals(result)){
            result = "NO CONTACT";
        }

        System.out.println(treemap);
        return result;
    }

}
