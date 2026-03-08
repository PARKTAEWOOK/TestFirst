package HackRank;

import java.util.Scanner;

public class Solution14 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();

    System.out.println(getSmallestAndLargest(s, k));
  }

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = s.substring(0, k);
    String largest = s.substring(0, k);

//    List<String> strings = new ArrayList<>();
//    for (int i = 0; i <= s.length()-k; i++) {
//      strings.add(s.substring(i,i+k));
//    }
//
//    strings.sort(String::compareTo);
//
//    smallest = strings.get(0);
//    largest = strings.get(strings.size()-1);

    for (int i = 1; i <= s.length() - k; i++) {
      String substr = s.substring(i, i + k);

      if (substr.compareTo(smallest) > 0) {
        smallest = substr;
      }

      if (substr.compareTo(largest) < 0) {
        largest = substr;
      }
    }
    return smallest + "\n" + largest;
  }
}
