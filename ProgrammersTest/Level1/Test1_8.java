package ProgrammersTest.Level1;

public class Test1_8 {

//    카카오에 입사한 신입 개발자 네오는 "카카오계정개발팀"에 배치되어, 카카오 서비스에 가입하는 유저들의 아이디를 생성하는 업무를 담당하게 되었습니다. "네오"에게 주어진 첫 업무는 새로 가입하는 유저들이 카카오 아이디 규칙에 맞지 않는 아이디를 입력했을 때, 입력된 아이디와 유사하면서 규칙에 맞는 아이디를 추천해주는 프로그램을 개발하는 것입니다.
//    다음은 카카오 아이디의 규칙입니다.
//
//    아이디의 길이는 3자 이상 15자 이하여야 합니다.
//    아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
//    단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
//            "네오"는 다음과 같이 7단계의 순차적인 처리 과정을 통해 신규 유저가 입력한 아이디가 카카오 아이디 규칙에 맞는 지 검사하고 규칙에 맞지 않은 경우 규칙에 맞는 새로운 아이디를 추천해 주려고 합니다.
//    신규 유저가 입력한 아이디가 new_id 라고 한다면,

//    1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
//    2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
//    3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
//    4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
//    5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
//    6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
//         만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
//    7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.

//    no	new_id	                            result
//    예1	"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
//    예2	"z-+.^."	                    "z--"
//    예3	"=.="	                        "aaa"
//    예4	"123_.def"                  	"123_.def"
//    예5	"abcdefghijklmn.p"          	"abcdefghijklmn"

    public static void main(String[] args){
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        soluiton2(new_id);
    }

    public static String solution(String new_id) {
        // 1. 소문자로 변경
        new_id = new_id.toLowerCase();

        // 2. 소문자 숫자 -_. 제외한 모든 문자 제거
        String id = "";
        for(int i = 0; i < new_id.length(); i++) {
            char ch = new_id.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                id += String.valueOf(ch);
            } else if(ch >= '0' && ch <= '9') {
                id += String.valueOf(ch);
            } else if(ch == '.' || ch == '-' || ch == '_') {
                id += String.valueOf(ch);
            }
        }

        // 3. . 하나만
        for(int i = 0; i < id.length(); i++) {
            if(id.charAt(i) == '.') {
                int j = i+1;
                String dot = ".";

                while(j != id.length() && id.charAt(j) == '.') {
                    dot += ".";
                    j++;
                }

                if(dot.length() > 1)
                    id = id.replace(dot, ".");
            }
        }

        // 4. 첫번째, 마지막 . 제거
        if(id.startsWith(".") ) {
            id = id.substring(1, id.length());
        } else if(id.endsWith(".")) {
            id = id.substring(0, id.length()-1);
        }

        // 5. 빈 문자열이라면 a 대입
        if(id.length() == 0) {
            id += "a";
        }

        // 6. 16자 이상이면, 15자만 남김
        if(id.length() >= 16) {
            id = id.substring(0, 15);
        }

        // 마지막 . 제거
        if(id.endsWith(".")) {
            id = id.substring(0, id.length()-1);
        }

        // 7. 2자 이하라면, 마지막 문자 길이 3까지 반복해서 붙임
        String last = id.charAt(id.length()-1) + "";
        if(id.length() == 2) {
            id = id + last;
        } else if(id.length() == 1) {
            id = id + last + last;
        }

        return id;
    }

    public static String soluiton2(String new_id){
        String id = new_id.toLowerCase(); // 소문자로
        id = id.replaceAll("[^-_.a-z0-9]", ""); //-_. 영문자 숫자만 남김
        id = id.replaceAll("[.]{2,}", "."); // .2개 이상 .으로
        id = id.replaceAll("^[.]|[.]$", ""); // 처음과 끝 . 제거

        if(id.equals("")) // 빈 문자열이라면 a 추가
            id += "a";

        if(id.length() >= 16){ // 16자 이상이면 15자로
            id = id.substring(0, 15);
            id = id.replaceAll("^[.]|[.]$", ""); // 끝 . 제거
        }
        if(id.length() <= 2) // 2자 이하라면 3자까지 마지막 문자추가
            while(id.length() < 3)
                id += id.charAt(id.length() - 1);

        return id;
    }
}
