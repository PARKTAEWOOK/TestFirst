package HackRank;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=true
 * Java Priority Queue.
 */

final class Student{
  int id;
  String name;
  double cgpa;
  public Student(int id, String name, double cgpa){
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
  }
  int getID(){
    return id;
  }
  String getName(){
    return name;
  }
  double getCGPA(){
    return cgpa;
  }
}

final class PriorityComparator implements Comparator<Student>{
  public int compare(Student o1, Student o2){
    int cgaComparison = Double.compare(o2.getCGPA(), o1.getCGPA());
    if(cgaComparison != 0)return cgaComparison;
    int nameComparison = o1.getName().compareTo(o2.getName());
    if(nameComparison != 0)return nameComparison;
    return Integer.compare(o1.getID(), o2.getID());
  }
}

final class Priorities{
  List<Student> getStudents(List<String> events){
    Queue<Student> priorityQueue = new PriorityQueue<>(new PriorityComparator());
    for(String e : events){
      String[] splitE = e.split(" ");
      if(splitE[0].equals("ENTER")){
        Student student = new Student(Integer.valueOf(splitE[3]), splitE[1], Double.valueOf(splitE[2]));
        priorityQueue.add(student);
      }
      else{
        priorityQueue.poll();
      }
    }
    List<Student> students = new ArrayList<Student>();
    while(!priorityQueue.isEmpty()){
      students.add(priorityQueue.poll());
    }
    return students;
  }

}


public class Solution8 {

  private final static Scanner scan = new Scanner(System.in);
  private final static Priorities priorities = new Priorities();

  public static void main(String[] args) {
    int totalEvents = Integer.parseInt(scan.nextLine());
    List<String> events = new ArrayList<>();

    while (totalEvents-- != 0) {
      String event = scan.nextLine();
      events.add(event);
    }

    List<Student> students = priorities.getStudents(events);

    if (students.isEmpty()) {
      System.out.println("EMPTY");
    } else {
      for (Student st: students) {
        System.out.println(st.getName());
      }
    }
  }

}
