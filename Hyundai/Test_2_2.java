package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/6288
 */
public class Test_2_2 {

  static class Jewelry implements Comparable<Jewelry> {
    private int weight;
    private int price;

    Jewelry(int weight, int price) {
      this.weight = weight;
      this.price = price;
    }

    @Override
    public String toString() {
      return "weight=" + weight + ", price=" + price;
    }

    @Override
    public int compareTo(Jewelry o) {
      return o.price - this.price;
    }
  }

  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int totalWeight = Integer.parseInt(st.nextToken());
    int jewelryType = Integer.parseInt(st.nextToken());

    List<Jewelry> jewelryList = new ArrayList<>();
    for (int i = 0; i < jewelryType; i++) {
      StringTokenizer st2 = new StringTokenizer(br.readLine());
      jewelryList.add(new Jewelry(Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken())));
    }

    Collections.sort(jewelryList);


//    jewelryList.stream().forEach(System.out::println);
    int answer = 0;


      for (int i = 0; i < jewelryList.size(); i++) {
//        System.out.println("jewelryList.get(i): " + jewelryList.get(i).weight);
        if(totalWeight > jewelryList.get(i).weight){
          answer+= jewelryList.get(i).weight * jewelryList.get(i).price;
          totalWeight -= jewelryList.get(i).weight;
//          System.out.println("totalWeight =" + totalWeight);
        }else{
          if(totalWeight != 0){
            answer += totalWeight * jewelryList.get(i).price;
            totalWeight -= totalWeight;
          }
          break;
        }
      }

    System.out.println(answer);
  }

}
