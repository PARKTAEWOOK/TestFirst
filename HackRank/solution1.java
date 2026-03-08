package HackRank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
 * BigDecimal
 */
public class solution1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String []s = new String[n+2];
    for(int i=0;i<n;i++){
      s[i] = sc.next();
    }
    sc.close();

    Arrays.sort(s, 0, n, new Comparator<String>() {
        public int compare(String o1, String o2) {
          BigDecimal b1 = new BigDecimal(o1);
          BigDecimal b2 = new BigDecimal(o2);
          return b2.compareTo(b1);
        }
    });
  }

}
