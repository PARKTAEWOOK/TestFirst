package liveStudy.ShinsegaeTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSum {

    public static int findMaxSum(List<Integer> list) {
        int returnValue = 0;
        List<Integer> list1 =  list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        returnValue = list1.get(0) + list1.get(1);

        
        return returnValue;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);

        System.out.println(findMaxSum(list));
    }

}
