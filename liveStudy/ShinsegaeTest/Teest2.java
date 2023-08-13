package liveStudy.ShinsegaeTest;

import java.util.*;
import java.util.stream.Collectors;

public class Teest2 {

        public static int findMaxSum(List<Integer> list) {
//            throw new UnsupportedOperationException("Waiting to be implemented.");
            int resultVales = 0;
            int latestNum =0;
            int secondLatestNum =0;
//            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
//
//            for (int priority : list) {
//                priorityQueue.add(priority);
//            }
//            latestNum = priorityQueue.poll();
//            secondLatestNum = priorityQueue.poll();


          List<Integer> list2 =  list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

          System.out.println(list2.get(0));
          System.out.println(list2.get(1));
//            Integer integerArray = Arrays.stream(list).boxed().toArray(Integer::new);
//
//            Arrays.sort(integerArray, Collections.reverseOrder());
//            System.out.println(Arrays.toString(list));



//            resultVales =latestNum + secondLatestNum;

            return resultVales;

        }

        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(5, 9, 7, 11);
            System.out.println(findMaxSum(list));
        }

}
