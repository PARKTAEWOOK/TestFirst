package test;

import java.util.Scanner;
import java.util.stream.IntStream;

public class programmers1_1_11 {

//    직사각형 별찍기  https://school.programmers.co.kr/learn/courses/30/lessons/12969
//    문제 설명
//    이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//    별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.


//    예시
//            입력
//
//5 3
//    출력
//
//        *****
//        *****
//        *****
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);

        StringBuilder sb = new StringBuilder();
        IntStream.range(0, a).forEach(s -> sb.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));

        IntStream.rangeClosed(1, 10).forEach(System.out::println);

//       System.out::println  https://myhappyman.tistory.com/65 참고
//       https://m.blog.naver.com/ding-dong/221386518751  IntStream.rangeClosed(1, 10).forEach(System.out::println);

    }

    public static void solution(int first_num, int second_num) {

        for(int j=0; j<second_num; j++){
            for(int i=0; i<first_num; i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
