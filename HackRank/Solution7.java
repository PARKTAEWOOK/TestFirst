package HackRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true
 *
 *  Comparetor
 */
public class Solution7 {

  static class Checker implements Comparator<Player> {


    @Override
    public int compare(Player o1, Player o2) {
      if(o1.score > o2.score){
        return -1; // 내림차순
      }else if(o1.score < o2.score){
        return 1;
      }else if(o1.score == o2.score){
        return o1.name.compareTo(o2.name);
      }
      return 0;
    }
  }

  static class Player{
    String name;
    int score;

    Player(String name, int score){
      this.name = name;
      this.score = score;
    }
  }

  public static void main(String[] args) throws IOException {
//    Scanner scan = new Scanner(System.in);
//    int n = scan.nextInt();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    Player[] player = new Player[n];
    Checker checker = new Checker();

    for(int i = 0; i < n; i++){
      st = new StringTokenizer(br.readLine());
      player[i] = new Player(st.nextToken(), (int)Integer.parseInt(st.nextToken()));
    }
//    scan.close();

    Arrays.sort(player, checker);
    for(int i = 0; i < player.length; i++){
      System.out.printf("%s %s\n", player[i].name, player[i].score);
    }
  }

}
