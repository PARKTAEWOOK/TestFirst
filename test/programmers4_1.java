package test;

import java.sql.Array;
import java.util.*;

public class programmers4_1 {
    // K 번째 수
    static class Command{
        int start;
        int end;
        int num;

        Command(int start, int end, int num){
            this.start = start;
            this.end = end;
            this.num = num;
        }

        @Override
        public String toString(){
            return "Command   "+
                    "start = " +  start +
                    "   end  = " + end +
                    "   num  = " + num;
        }

    }
    public static void main(String[] args){
//[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
        int[] arrays = {1, 5, 2, 6, 3, 7, 4};

        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println( "commands.length  : " + commands.length);

        System.out.println( solution2(arrays,commands));
    }
    public static int[] solution(int[] array, int[][] commands) {
//        int[] answer = {};
        int[] answer = new int[commands.length];
        Queue<Command> arrList = new LinkedList<>();
        ArrayList<Integer> test = new ArrayList<>();
        for(Integer a : array){
            test.add(a);
        }

        System.out.println( "TEST   "+test);
        for(int i = 0 ; i < commands.length ; ++i){
            arrList.offer(new Command(commands[i][0], commands[i][1],commands[i][2]));
        }
        System.out.println("arrList   "+arrList);
        while (!arrList.isEmpty()){
            ArrayList<Integer> test2 = new ArrayList<>();
            test2 = test;
            System.out.println("test 복사   "+test2);
            int start = arrList.peek().start-1;
            int end = arrList.peek().end-1;
            int num = arrList.peek().num-1;

                if(start == end){

                    System.out.println("test2   "+ test2.subList(start,start+1));

                }
                else{
                    test2.subList(start,end).sort(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer t1, Integer t2) {
                            return t1 - t2;
                        }
                    });



                }



            System.out.println(" while 문 안에서 동작 " + start +    ",," + end + ",,," + num);
            arrList.poll();

        }


        return answer;
    }

    public static int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){

            int start = commands[i][0]-1;
            int end = commands[i][1];
            int num = commands[i][2]-1;
            System.out.println(" start : " + start  +  "  end :" + end + " num :  " + num);
            int[] temp = Arrays.copyOfRange(array, start, end);

//            Arrays.copyOf(원본배열, 복사할 길이);
//            Arrays.copyOfRange(원본 배열, 복사할 시작인덱스, 복사할 끝인덱스) 인덱스는 0부터 시작하는것 기준

            Arrays.sort(temp);

            for(int j : temp){
                System.out.print( j +" ");
            }

            answer[i]= temp[num];

            System.out.println(" answer[i] : " + answer[i]);
        }

        return answer;
    }
}
