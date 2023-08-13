package ProgrammersTest.Level1;

import java.util.ArrayList;

public class Test1_13 {

//    주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가
//    되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
//
//    제한사항
//    nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
//    nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.
//

//    입출력 예
//       nums	   result
//      [1,2,3,4]	 1
//      [1,2,7,6,4]	 4
//    입출력 예 설명
//    입출력 예 #1
//            [1,2,4]를 이용해서 7을 만들 수 있습니다.
//
//    입출력 예 #2
//            [1,2,4]를 이용해서 7을 만들 수 있습니다.
//            [1,4,6]을 이용해서 11을 만들 수 있습니다.
//            [2,4,7]을 이용해서 13을 만들 수 있습니다.
//            [4,6,7]을 이용해서 17을 만들 수 있습니다.
    public static void main(String[] args){

        int[] nums = {1,2,3,4};

        System.out.println(solution(nums));

    }

    public static int solution(int[] nums) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
// 합을 저장할 저장공간 선언
        ArrayList<Integer> list = new ArrayList<Integer>();
        // for문을 이용하여 배열의 합을 구한다.
        for(int i = 0; i < nums.length; i++) {
            if(i + 2 >= nums.length) break;
            for(int j = i + 1; j < nums.length; j++) {
                for(int h = j + 1; h < nums.length; h++) {
                    list.add(nums[i] + nums[j] + nums[h]);
                }
            }
        }

        // 저장된 합이 소수인지 판별한다.
        for(Integer i : list) {
            int count = 2;
            answer++;
            while(count < i) {
                // 저장된 값이 count로 나눴을 때 나머지가 0이라면 소수가 아니기 때문에 answer의 값을 더하지 않는다.
                if(i % count == 0) {
                    answer--;
                    break;
                }
                count++;
            }
        }

        return answer;
    }

    public int solution2(int[] nums) {
        int answer = 0;
        boolean chk = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k]; //값을 담아
                    if (num >= 2) //경우의 수를 찾아서
                        chk = sosu(num);
                    if (chk == true) //소수가 맞을 경우
                        answer++;

                }
            }

        }
        return answer;
    }

    public boolean sosu(int num) {
        boolean check = true;
        if(num==2) { //소수일때
            return check;

        }
        for(int i=2; i<num; i++) { //소수가 아닐때
            if(num%i ==0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
