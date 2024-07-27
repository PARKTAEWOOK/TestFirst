package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class programmers7_20 {
//    [3차] 파일명 정렬 https://school.programmers.co.kr/learn/courses/30/lessons/17686
//    파일명은 크게 HEAD, NUMBER, TAIL의 세 부분으로 구성된다.
//
//    HEAD는 숫자가 아닌 문자로 이루어져 있으며, 최소한 한 글자 이상이다.
//    NUMBER는 한 글자에서 최대 다섯 글자 사이의 연속된 숫자로 이루어져 있으며, 앞쪽에 0이 올 수 있다. 0부터 99999 사이의 숫자로, 00000이나 0101 등도 가능하다.
//    TAIL은 그 나머지 부분으로, 여기에는 숫자가 다시 나타날 수도 있으며, 아무 글자도 없을 수 있다.
//    파일명	            HEAD	  NUMBER	  TAIL
//    foo9.txt	        foo 	    9	            .txt
//    foo010bar020.zip	foo	      010	    bar020.zip
//    F-15	            F-	    15	                (빈 문자열)

//    입출력 예제
//    입력: ["img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"]
//    출력: ["img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"]
//
//    입력: ["F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"]
//    출력: ["A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"]
    private static List<File> list = new ArrayList<>();
    public static void main(String[] args) {
        String[] filename = {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"};
        solution(filename);
    }
    public static String[] solution(String[] files) {
        String[] answer = new String[files.length];
        int idx = 0;
        for (String file : files) {
            boolean numflag = false;
            StringBuilder num = new StringBuilder();
            StringBuilder head = new StringBuilder();
            StringBuilder tail = new StringBuilder();

            for (int i = 0; i < file.length(); i++) {
                char c = file.charAt(i);
                if (c >= '0' && c <= '9') {
                    num.append(c);
                    numflag = true;
                } else {
                    if (!numflag) head.append(c);
                    else {
                        tail.append(file.substring(i));
                        break;
                    }
                }
            }
            System.out.println(head + " " + num + " " + tail);
            list.add(new File(idx, head.toString(), num.toString(), tail.toString()));
            idx++;
        }

        Collections.sort(list);

        for (int i = 0; i < answer.length; i++) {
            File file = list.get(i);
            answer[i] = file.head + file.num + file.tail;
        }

        return answer;
    }
    private static class File implements Comparable<File> {
        int idx;
        String head;
        String num;
        String tail;

        public File(int idx, String head, String num, String tail) {
            this.idx = idx;
            this.head = head;
            this.num = num;
            this.tail = tail;
        }

        @Override
        public int compareTo(File f) {
            if (this.head.equalsIgnoreCase(f.head)) {
                if (Integer.parseInt(this.num) == Integer.parseInt(f.num)) {
                    return this.idx - f.idx;
                }
                return Integer.parseInt(this.num) - Integer.parseInt(f.num);
            }
            return this.head.toLowerCase().compareTo(f.head.toLowerCase());
        }
    }
}
