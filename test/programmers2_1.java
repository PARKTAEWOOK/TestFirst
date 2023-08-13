package test;

import java.util.LinkedList;
import java.util.Queue;

public class programmers2_1 {
//
//    트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다.
//    트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
//    ※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
//
//    예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
//
//    경과 시간	다리를 지난 트럭	다리를 건너는 트럭	대기 트럭
//          0	[]	                []	        [7,4,5,6]
//        1~2	[]	                [7]     	[4,5,6]
//        3	    [7]             	[4]	        [5,6]
//        4	    [7]	                [4,5]	    [6]
//        5	    [7,4]	            [5]     	[6]
//        6~7	[7,4,5]	            [6]	        []
//        8	    [7,4,5,6]	        []      	[]
//    따라서, 모든 트럭이 다리를 지나려면 최소 8초가 걸립니다.
//
//    solution 함수의 매개변수로 다리 길이 bridge_length, 다리가 견딜 수 있는 무게 weight, 트럭별 무게 truck_weights가 주어집니다.
//    이때 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 return 하도록 solution 함수를 완성하세요.
//
//    제한 조건
//    bridge_length는 1 이상 10,000 이하입니다.
//            weight는 1 이상 10,000 이하입니다.
//    truck_weights의 길이는 1 이상 10,000 이하입니다.
//    모든 트럭의 무게는 1 이상 weight 이하입니다.

   static class Truck {
        int weight;
        int entry;

        Truck(int weight, int entry){
            this.weight = weight;
            this.entry = entry;
        }

       @Override
       public String toString() {
           return "Truck{" +
                   "weight=" + weight +
                   ", entry=" + entry +
                   '}';
       }
   }

    public static void main(String[] args){
//        2	    10	[7,4,5,6]	8
//        100	100	[10]	    101
//        100	100	[10,10,10,10,10,10,10,10,10,10]	110
        int bridge_length1 = 2;
        int bridge_length2 = 100;
        int bridge_length3 = 100;

        int weight1 = 10;
        int weight2 = 100;
        int weight3 = 100;

        int[] truck_weights1 = {7,4,5,6};
        int[] truck_weights2 = {10};
        int[] truck_weights3 = {10,10,10,10,10,10,10,10,10,10};

        System.out.println(" 최종 걸린 시간 : " +solution2(bridge_length1,weight1,truck_weights1));

    }

    public static int solution1(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<String> bridge = new LinkedList<String>();

        if( bridgeAvailableCheck(bridge_length, bridge.size()) ){
            if(bridgeWeighCheck(bridge) ){

            }
        }

        return answer;
    }

    public static boolean bridgeAvailableCheck(int bridge_length, int noewBridge_size){
        boolean resultBoolean = true;

        if(noewBridge_size > bridge_length){
            resultBoolean = false;
        }
        else if(noewBridge_size <= bridge_length){
            resultBoolean = true;
        }

        return resultBoolean;
    }

    public static boolean bridgeWeighCheck(Queue<String> bridge){

        boolean resultBoolean = true;

        return resultBoolean;
    }


     public static  int solution2(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> waiting = new LinkedList<>();
        Queue<Truck> bridge = new LinkedList<>();
        // 2, 10, {7,4,5,6};
        for(int i = 0 ; i < truck_weights.length ; ++i){
            waiting.offer(new Truck(truck_weights[i], 0));
        }

        int time = 0;
        int totalWeight = 0;
        while(!waiting.isEmpty() || !bridge.isEmpty()){
            time++;
            if(!bridge.isEmpty()) {
                Truck t = bridge.peek();
                if(time - t.entry >= bridge_length) {
                    totalWeight -= t.weight;
                    bridge.poll();
                }
            }

            if(!waiting.isEmpty()) {
                if(totalWeight + waiting.peek().weight <= weight) {
                    Truck t = waiting.poll();
                    totalWeight += t.weight;
                    bridge.offer(new Truck(t.weight, time));
                }
            }
        }
        return time;
    }

}
