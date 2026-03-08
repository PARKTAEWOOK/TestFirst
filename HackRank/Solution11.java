package HackRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/prime-checker/problem?isFullScreen=true
 * Prime Checker
 */
public class Solution11 {
  public static void main(String[] args) throws IOException {
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int n1 = Integer.parseInt(br.readLine());
    int n2 = Integer.parseInt(br.readLine());
    int n3 = Integer.parseInt(br.readLine());
    int n4 = Integer.parseInt(br.readLine());
    int n5 = Integer.parseInt(br.readLine());
    Prime ob = new Prime();
    ob.checkPrime(n1);
    ob.checkPrime(n1, n2);
    ob.checkPrime(n1, n2, n3);
    ob.checkPrime(n1, n2, n3, n4, n5);



  }

  public static boolean isPrime(int number) {
    if(number <= 1) return false;
    if(number == 2) return true;
    if(number % 2 == 0) return false;
    for(int i = 2; i < number; i++){
      if(number % i == 0) return false;
    }
    return true;
  }
}

class Prime {
  public void checkPrime(int... numbers) {
    for (int number : numbers) {
      if (isPrime(number)) {
        System.out.print(number + " ");
      }
    }
    System.out.println(); // 줄바꿈
  }

  private boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    for(int i = 2; i < n; i++){
      if(n % i == 0) return false;
    }
    return true;
  }
}


