package ProgrammersTest.Level2;

/*
* https://school.programmers.co.kr/learn/courses/30/lessons/176962
* TOPIC : 과제 진행하기
*
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

/*
*
* 3 ≤ plans의 길이 ≤ 1,000
plans의 원소는 [name, start, playtime]의 구조로 이루어져 있습니다.
name : 과제의 이름을 의미합니다.
2 ≤ name의 길이 ≤ 10
name은 알파벳 소문자로만 이루어져 있습니다.
name이 중복되는 원소는 없습니다.
start : 과제의 시작 시각을 나타냅니다.
"hh:mm"의 형태로 "00:00" ~ "23:59" 사이의 시간값만 들어가 있습니다.
모든 과제의 시작 시각은 달라서 겹칠 일이 없습니다.
과제는 "00:00" ... "23:59" 순으로 시작하면 됩니다. 즉, 시와 분의 값이 작을수록 더 빨리 시작한 과제입니다.
playtime : 과제를 마치는데 걸리는 시간을 의미하며, 단위는 분입니다.
1 ≤ playtime ≤ 100
playtime은 0으로 시작하지 않습니다.
배열은 시간순으로 정렬되어 있지 않을 수 있습니다.
진행중이던 과제가 끝나는 시각과 새로운 과제를 시작해야하는 시각이 같은 경우 진행중이던 과제는 끝난 것으로 판단합니다.
*
*
*
*
* 입출력 예
plans	                                                                              result
[["korean", "11:40", "30"], ["english", "12:10", "20"], ["math", "12:30", "40"]]	["korean", "english", "math"]
[["science", "12:40", "50"], ["music", "12:20", "40"], ["history", "14:00", "30"], ["computer", "12:30", "100"]]	["science", "history", "computer", "music"]
[["aaa", "12:00", "20"], ["bbb", "12:10", "30"], ["ccc", "12:40", "10"]]	["bbb", "ccc", "aaa"]
* */
public class Level02_01 {

  static class Task {
    String name;
    int start;
    int playtime;

    Task(String name, int start, int playtime) {
      this.name = name;
      this.start = start;
      this.playtime = playtime;
    }

    @Override
    public String toString() {
      return "name : " + name + ", start : " + start + ", playtime : " + playtime;
    }
  }
  public static void main(String[] args) {
    String[][] problem = new String[][]{
        {"korean", "11:40", "30"},
        {"english", "12:10", "20"},
        {"math", "12:30", "40"}
    };
    String[] ans = solution(problem);
//    System.out.println(Arrays.stream(ans).toArray().toString());
    System.out.println(Arrays.toString(ans));
  }

  public static String[] solution(String[][] plans) {

    List<Task> list = new ArrayList<>();

    for (String[] plan : plans) {
      String name = plan[0];
      String[] time = plan[1].split(":");

      int start = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
      int playtime = Integer.parseInt(plan[2]);

      list.add(new Task(name, start, playtime));
    }

    list.sort(Comparator.comparingInt(t -> t.start));
    System.out.println("LISt 정렬 : " + list.toString());
    Stack<Task> stack = new Stack<>();
    List<String> answer = new ArrayList<>();

    for (int i = 0; i < list.size(); i++) {

      Task now = list.get(i);

      if (i == list.size() - 1) {
        answer.add(now.name);
        break;
      }

      Task next = list.get(i + 1);

      int time = next.start - now.start;

      if (now.playtime <= time) {

        answer.add(now.name);

        int remain = time - now.playtime;

        while (!stack.isEmpty() && remain > 0) {

          Task stop = stack.pop();

          if (stop.playtime <= remain) {
            remain -= stop.playtime;
            answer.add(stop.name);
          } else {
            stop.playtime -= remain;
            stack.push(stop);
            break;
          }
        }

      } else {

        now.playtime -= time;
        stack.push(now);
      }
    }

    while (!stack.isEmpty()) {
      answer.add(stack.pop().name);
    }

    return answer.toArray(new String[0]);
  }

}
