package test;

import java.util.*;

public class programmers2_3 {

//    프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다. 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
//
//    또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
//
//    먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
//
//    제한 사항
//    작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
//    작업 진도는 100 미만의 자연수입니다.
//    작업 속도는 100 이하의R 자연수입니다.
//    배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다. 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
//            입출력 예
//    progresses	speeds	return
//    [93, 30, 55]	[1, 30, 5]	[2, 1]
//    [95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
//    입출력 예 설명
//    입출력 예 #1
//    첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
//    두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다. 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
//    세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.
//
//            따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.
//
//    입출력 예 #2
//    모든 기능이 하루에 1%씩 작업이 가능하므로, 작업이 끝나기까지 남은 일수는 각각 5일, 10일, 1일, 1일, 20일, 1일입니다. 어떤 기능이 먼저 완성되었더라도 앞에 있는 모든 기능이 완성되지 않으면 배포가 불가능합니다.
//
//    따라서 5일째에 1개의 기능, 10일째에 3개의 기능, 20일째에 2개의 기능이 배포됩니다.
//
//※ 공지 - 2020년 7월 14일 테스트케이스가 추가되었습니다.

    public static void main(String[] args){
        int[] progresses1 = {93, 30, 55};
        int[] progresses2 = {95, 90, 99, 99, 80, 99,100};

        int[] speeds1 = {1, 30, 5};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

//        System.out.println(solution(progresses1,speeds1).clone())clone;
        System.out.println(solution2(progresses2,speeds2));


    }

    public static int[] solution(int[] progresses, int[] speeds) {

        List<int[]> queue = new LinkedList<>();
        for(int i =0; i< progresses.length; i++){
            queue.add(new int[]{progresses[i], speeds[i]});
        }

        List<Integer> result = new ArrayList<>();

        while (queue.size() >0){

            for(int[] arr: queue){
                arr[0] += arr[1];
            }

            if(queue.get(0)[0] >= 100){

                int count = 0;

                for(int i =0; i < queue.size(); i++){

                    if(queue.get(i)[0] >= 100){
                        queue.remove(i);
                        count++;
                    }
                    else{
                        break;
                    }
                }
                result.add(count);

            }
        }

        int[] answer = new int[result.size()];
        for(int i= 0; i<answer.length; i++){
            answer[i] = result.get(i);
        }

        return answer;
    }

    public static int[] solution2(int[] progresses, int[] speeds) {


        Queue<Integer> quePre = new LinkedList<>();

        // 각 progress 를 돌며 현재 작업량 대비 하루 작업량을 비교하여 총 완료 일 수를 계산한
        for(int i=0; i<progresses.length; i++){
            quePre.offer(
                    (100-progresses[i]) % speeds[i] == 0 ?
                            (100-progresses[i]) / speeds[i] :
                            (100-progresses[i]) / speeds[i] + 1
            );
        }

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("peek     :  "+quePre.peek());
        int currentProgressWorkDay= quePre.poll();

        System.out.println("currentProgressWorkDay     :  "+currentProgressWorkDay);
        int doneProgress = 1;

        // 위에 계산된 각 작업량에 따른 총 완료 일수를 queue 에서 하나씩 꺼내 다음 작업량에 완료일 수를 비교하여
        // 현재 작업 완료일 수 보다 작으면 현재 작업이 출시되는날 같이 출시된다고 계산하여 ++ 해주고
        // 뒤에 작업일 수가 더 크면 현재 작업이 완료되는 날에는 현재 작업만 출시된다고 계산해주는 로직 .
        while (!quePre.isEmpty()){
            System.out.println("nextProgressWorkDay     :  "+quePre.peek());
            int nextProgressWorkDay = quePre.poll();
            if(currentProgressWorkDay >= nextProgressWorkDay){
                doneProgress++;
            }
            else{
                list.add(doneProgress);
                currentProgressWorkDay = nextProgressWorkDay;
                doneProgress = 1;
            }
        }
        list.add(doneProgress);

        int[] answer = new int[list.size()];
        for(int i= 0; i<list.size(); i++){
            System.out.println(list.get(i));
            answer[i] = list.get(i);
        }

        return answer;
    }

}
