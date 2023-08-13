package test;

public class programmers6_1 {

    // Greedy
//    전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
//    reserve가 매개변수로 주어질 때, 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
//
//            n	lost	reserve	    return
//            5	[2, 4]	[1, 3, 5]	 5
//            5	[2, 4]	[3]         	4
//            3	[3]	    [1]	             2
    public static void main(String[] args){
        int n1 = 5;
        int n2 = 5;
        int n3 = 3;

        int[] lost1 = {2,4};
        int[] lost2 = {2,4};
        int[] lost3 = {3};

        int[] reserve1 = {1,3,5};
        int[] reserve2 = {3};
        int[] reserve3 = {1};

        System.out.println(solution(n1,lost2,reserve2));

    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int lostSize = lost.length;
        int reservetSize = reserve.length;
        int lostButFind = 0;

        for(int i=0; i<lostSize; i++){
            System.out.println("lostSize value : " + lost[i]);
            for(int j=0; j<reservetSize; j++){

                System.out.println("reservetSize value : " + reserve[j]);
                if( lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1){
                    lostButFind++;
                    System.out.println("find value : " + lostButFind);

                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        answer = (n - lostSize) + lostButFind;

        return answer;
    }

    public static int solution2(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int lostSize = lost.length;
        int reservetSize = reserve.length;
        int lostButFind = 0;
        int count = 0;

        for(int i=0; i<lostSize; i++){
            for(int j=0; j<reservetSize; j++){

                if( lost[i] == reserve[j]){
                    count++;

                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }


        for(int i=0; i<lostSize; i++){
            System.out.println("lostSize value : " + lost[i]);
            for(int j=0; j<reservetSize; j++){

                System.out.println("reservetSize value : " + reserve[j]);
                if( lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1){
                    lostButFind++;
                    System.out.println("find value : " + lostButFind);

                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        answer = (n - lostSize) + lostButFind + count;

        return answer;
    }
}
