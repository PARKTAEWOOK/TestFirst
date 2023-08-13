package test;

public class programmers5_3 {
    public static void main(String[] args){

//        10	2	[4, 3]
//        8	    1	[3, 3]
//        24	24	[8, 6]

        int[][] colors ={{10,2},{8,1},{24,24}};
        System.out.println(solution(colors[0][0],colors[0][1]));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        System.out.println(brown + "   "  + "   dff  "   + yellow);
        int block = brown + yellow;

        for(int i=3 ; i<=block; i++){

            if(block % i == 0 ){
                int col = block / i;
                int row = block / col ;

                int a  = col - 2 ; // 가로
                int b = row - 2 ;  // 세로

                if(a*b == yellow && col >= row){
                    System.out.println(col + "   ddd   " + row);
                    return new int[]{col, row};
                }
            }

        }
        return answer;
    }
}
