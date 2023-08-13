package naverTest;

import java.util.regex.Pattern;

public class test2 {
    public static void main(String[]  args ){

        System.out.println(removeAllWhitespaces("DDD eee 3"));

    }

    public static  String solution(String target) {
        String dd ="";
        StringBuilder sb = new StringBuilder();
        char[] arr;
        arr = target.toCharArray();

        for(int i=0; i<arr.length; i++){
            if(97<=arr[i] && arr[i] <=122){
                arr[i]=(char)(arr[i]-32);
            }
            sb.append(arr[i]);
        }
        if(!sb.toString().isEmpty()){

        }
        return sb.toString();
    }


    public static String removeAllWhitespaces(String target){
//        log.info("Mehtod execution started");
        String resultString ="";
        char[] arr;
        arr = target.toCharArray();
        boolean checkNumner = false;

        for(int i=0; i<arr.length; i++){
            if(49<=arr[i] && arr[i] <=57){
                checkNumner = true;
                break;
            }
        }

        if(checkNumner){

        }
        else{
            resultString = target.replaceAll(" ", "" );
        }

        return resultString;
//        SELECT CH.NAME AS NAME
//                , NVL(CH.PRICE * PR.TOTAL,0) AS CNT
//        FROM CHARACTERS  CH
//        LEFT OUTER JOIN (
//                SELECT ITEM
//                ,  COUNT ( ITEM ) AS TOTAL
//                FROM PURCHASES
//                GROUP BY ITEM
//        ) PR
//        ON CH.NAME = PR.ITEM
//        ORDER BY CH.NAME
    }

//    item	total
//    Lion	12
//    Lobster	8
//    Albatross	10
//    Bee	13
//    goat	8
//name	cnt
//    Albatross	1000
//    Bee	1000
//    Hamster	0
//    Lion	10000
//    Lobster	2000
//    goat	10000
//
//-- 코드를 입력하세요
//
//    select cnt
// , count ( cnt ) as total
//    from (
//
//            SELECT pl.ID
//            , nvl(gr1.total,0) as cnt
//    from PLACES pl
//    left outer join
//            (
//                    select PLACE_ID as ID
//                    , count (PLACE_ID) AS total
//    from PLACE_REVIEWS
//    group by PLACE_ID
//  )gr1
//    on pl.ID = gr1.ID
//  )
//    group by cnt
//
//
//
//    51	1
//    58	1
//    200	1
//    99	1
//    1	1
//    2	2
//    73	1
//    10	1
//    4	1
//    5	1
//    0	3

}


//
//    select count_sort
//, sum(total) as cnt
//        from (
//        select cnt
//        , case when cnt = 0
//        then  '0'
//        when cnt > 0 and cnt < 50
//        then '< 50'
//        when cnt > 50 and cnt < 100
//        then '< 100'
//        else '>= 100'
//        end as count_sort
//        , count ( cnt ) as total
//        from (
//
//        SELECT pl.ID
//        , nvl(gr1.total,0) as cnt
//        from PLACES pl
//        left outer join
//        (
//        select PLACE_ID as ID
//        , count (PLACE_ID) AS total
//        from PLACE_REVIEWS
//        group by PLACE_ID
//        )gr1
//        on pl.ID = gr1.ID
//        )
//        group by cnt
//        )gr2
//        group by count_sort
//        order by decode (count_sort, '0',1, '< 50',2, '< 100',3, '>= 100',4)
//

//
//    SELECT CH.NAME AS NAME
//        , NVL(CH.PRICE * PR.TOTAL,0) AS CNT
//        FROM CHARACTERS  CH
//        LEFT OUTER JOIN (
//        SELECT ITEM
//        ,  COUNT ( ITEM ) AS TOTAL
//        FROM PURCHASES
//        GROUP BY ITEM
//        ) PR
//        ON CH.NAME = PR.ITEM
//        ORDER BY CH.NAME
//        ;
