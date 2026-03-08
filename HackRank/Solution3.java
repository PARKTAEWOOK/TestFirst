package HackRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int testCases = Integer.parseInt(in.nextLine());
    Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
    while(testCases>0){
      String line = in.nextLine();
      Matcher m = p.matcher(line);
      boolean matched = false;
      while (m.find()) {
        matched = true;
        System.out.println(m.group(2));
      }
      //Write your code here
      if(!matched){
        System.out.println("None");
      }
      testCases--;
    }
  }

}
