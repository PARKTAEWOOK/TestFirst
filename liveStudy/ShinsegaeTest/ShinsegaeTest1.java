package liveStudy.ShinsegaeTest;

import javax.lang.model.type.UnionType;
import javax.swing.*;
import java.util.HashMap;

public class ShinsegaeTest1 {

    private final HashMap<String, String[]> Hobbies = new HashMap<String, String[]>();

    public static void main(String[] args){

        solveProblem("eeeeaa");


    }

    public void test1(){
        // users 테이블에 banned 컬럼 추가해라
        // 제약 조건 1
        // 무조건 int
        // default value 0
        // 허용값 0 , 1

//        Alter Table users ADD COLUMN banned int NOT NULL SET DEFAULT 0;
//        ALTER TABLE users ADD ( banned int DEFAULT 0);
//
//        ALTER TABLE users MODIFY ( banned DEFAULT 0);

//   참고 : https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=nitrogehne&logNo=150165167594
//        https://dd00oo.tistory.com/m/483?category=614651
//        Alter Table users ADD COLUMN banned int NOT NULL SET DEFAULT 0;
//        ALTER TABLE users ADD CONSTRAINT banned_check CHECK banned IN (0,1);

    }

    public void test2() {
        // 가장 낮은 가격을 가진 모든 product 이름을 가지고와라

        // SELECT NAME
        //   from products
        //   where price = (
        //              SELECT min(price)
        //                FROM products
        //
        //
        //   )

    }

    public void test3(){
        // 테이블 만들어라
        //  menuItems

        // id integer pK
        //   title varchar ( 30 )
        // url varchar ( 100 )
        // 두개의 메뉴는 같은 url 를 가질 수 없다

        // 참고 : http://www.tcpschool.com/mysql/mysql_constraint_primaryKey
//        http://www.tcpschool.com/mysql/mysql_constraint_unique
//        https://jhnyang.tistory.com/307
//        Create Table menuItems(
//
//                id int ,
//        title VARCHAR(30) NOT NULL,
//                url VARCHAR (100) UNIQUE NOT NULL,
//        CONSTRAINT PK_menuItems primary key (id)
//
//
//        )

//        CREATE TABLE board(
//
//                id VARCHAR(10) UNIQUE NOT NULL,
//
//                nickName VARCHAR(20) CONSTRAINT nickName_uq UNIQUE(nickName),
//
//                title VARCHAR(10) NOT NULL,
//
//                content VARCHAR(1000),
//
//                hashtag VARCHAR(100)
//
//                /* CONSTRAINT nickName_uq UNIQUE (id,nickName) */
//
//        );
//
//
//        출처: https://mine-it-record.tistory.com/41 [나만의 기록들]
    }



    public static String test4(String inputd){
        String resultValue = "";

        String doubleProblem = "AA";
        char[] inputchar = inputd.toCharArray();

        for(int i = 0; i < inputd.length(); i++) { // i가 0부터 사용자가 입력한 문자열의 길이만큼 반복문을 돌린다.
//  		  if(!result.contains(String.valueOf(input.charAt(i)))) { // 사용자가 입력받은 문자열의 i번째 문자를 String으로 바꾸고 result에 이 문자가 포함되어 있지 않다면
            if((i+1)== inputd.length()){
                break;
            }

            if(inputchar[i] != inputchar[i+1]) {
            } else {
                resultValue += String.valueOf(inputd.charAt(i));  // result에 계속 추가, 즉 중복되지 않으면 추가
            }
        }

        return resultValue;
    }

    public static void solveProblem(String problem){

        System.out.println(test4(problem));

    }

    public void test5(){

        //

//        SELECT A.id
//                , B.name
//                , C.name
//        FROM tasks A
//                LEFT OUTER JOIN employees B
//                   on A.authorId = B.id
//                LEFT OUTER JOIN employees C
//                        on A.assigneeId = B.id
    }

    public void test6(){

//        select companyName
//                , marketCapitalization
//
//                from (
//
//
//                        select companyName
//                        , marketCapitalization
//                        FROM fsia
//
//                        Union
//
//                        select companyName
//                        , (sharePrice * sharesOutstanding ) as marketCapitalization
//                        from fsib
//                   )
//                        order by marketCapitalization DESC

    }


    public void test7(){

//        SELECT name
//         FROM employes
//        where id not in (
//                         select employeeID
//                          from sales
//                         group by employeeID
//                        )
    }

    public void test8(){
        /*
        *   SELECT CH.NAME AS NAME
        *          , NVL(CH.PRICE * PR.TOTAL, 0)  AS CNT
        *      FROM CHARACTERS CH
        *      LEFT OUTER JOIN (
        *                           SELECT ITEM
        *                               , COUNT ( ITEM ) AS TOTAL
        *                             FROM PURCHASES
        *                            GROUP BY ITEM
        *                       ) PR
        *         ON CH.NAME = PR.ITEM
        * ORDER BY CH.NAME
        * ;
        *
        *
        * */
    }

    public void test9(){
        /*
        *   SELECT COUNT_SORT
        *        , SUM(TOTAL) AS CNT
        *    FROM (
        *              SELECT CNT
        *                   , CASE WHEN CNT = 0
        *                           THEN '0'
        *                          WHEN CNT > 0 AND CNT < 50
        *                           then '< 50'
        *                           WHEN CNT > 50 AND CNT < 100
        *                           THEN '<100'
        *                       else '>=100'
        *                     END AS COUNT_SORT
        *                   , COUNT ( CNT ) AS TOTAL
        *                 FROM (
        *
        *                           SELECT PL
        *                       )
        *          )
        *
        * */
    }
}
