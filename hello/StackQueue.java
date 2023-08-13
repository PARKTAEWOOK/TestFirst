package hello;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

    public static void main(String[] args){
        Stack<String> st = new Stack<String>();
        Queue<String>  q = new LinkedList<String>();

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");


        System.out.println("---- STACK ----");
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }

        System.out.println("---- Queue ----");
        System.out.println("---- Queue 2 ----" );

        while (!q.isEmpty()){
            System.out.println("peek    "+q.peek());
            System.out.println(q.poll());
        }

        System.out.println(q.poll());

        HashMap<Integer,Integer> hm = new HashMap<>();

        hm.put(1,1);
        hm.put(2,2);
        hm.put(4,3);

        hm.remove(2);



        System.out.println(hm);
    }
}
