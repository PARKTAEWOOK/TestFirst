package testAnswer;

public class Test01 {

	public static void main(String[] args) {
		String test = "test";
		System.out.println(test.substring(0,0));
		System.out.println(solution("xyZA", "ABCxy"));
		
		System.out.println(solution("xyZA1", "xyZA123"));
	}
	
	public static String solution(String s1, String s2) {
        if(s1.equals(s2)) {
            return s1;
        }
        else if(s1.contains(s2) || s2.contains(s1)) {
        	return s2.length() > s1.length() ? s2 : s1;
        }
        String answer = "";

        int maxLength1 = 0;
        int maxLength2 = 0;

        int length = s1.length() > s2.length() ? s2.length(): s1.length();

        for(int num = 1; num < length; num++) {
            if(s1.substring(0, num).equals(s2.substring(s2.length()-num, s2.length()))) { // s1 이 뒷 문자일경우
                //System.out.println("s1 뒤" +s1.substring(0,num));
                maxLength1 = num;
            }
            if(s2.substring(0, num).equals(s1.substring(s1.length()-num, s1.length()))) { // s2 가 뒷문자일경우
                //System.out.println("s2 뒤" + s2.substring(0,num));
                maxLength2 = num;
            }
        }

        if(maxLength1 > maxLength2) {
            answer = s2 + s1.substring(maxLength1);
        }
        else {
            answer = s1 + s2.substring(maxLength2);
        }

        return answer;
    }
	/*
	static public String solution(String s1, String s2) {
		String answer = "";
		
		int maxLength1 = 0;
		int maxLength2 = 0;
		
		int length = s1.length() > s2.length() ? s2.length() : s1.length() ;
		
		for(int num = 1; num < length; num++) {
			if(s1.substring(0, num).equals(s2.substring(s2.length()-num, s2.length()))) { // s1 �� �� �����ϰ��
				//System.out.println("s1 ��" +s1.substring(0,num));
				maxLength1 = num;
			}
			if(s2.substring(0, num).equals(s1.substring(s1.length()-num, s1.length()))) { // s2 �� �޹����ϰ��
				//System.out.println("s2 ��" + s2.substring(0,num));
				maxLength2 = num;
			}
		}
		
		if(maxLength1 > maxLength2) {
			answer = s2 + s1.substring(maxLength1);
		}
		else {
			answer = s1 + s2.substring(maxLength2);
		}
		
		return answer;
	}
	*/
	
	/*
	public String solution(String s1, String s2) {
		String answer = "";
		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();
		
		int length = s1Arr.length > s2Arr.length ? s2Arr.length: s1Arr.length;
		
		boolean xBool = true;
		boolean yBool = true;
		String x = "";
		String y = "";
		for(int num = 0; num < length; num++) {
			int idxX1 = s1Arr.length - num;
			int idxX2 = num;
			
			int idxY1 = num;
			int idxY2 = s2Arr.length - num;
			
			if(xBool && s1Arr[idxX1] == s2Arr[idxX2]) {
				x = x + s1Arr[idxX1];
			} else if(s1Arr[idxX1] != s2Arr[idxX2]){
				xBool = false;
			}
			
			if(yBool && s1Arr[idxY1] == s2Arr[idxY2]) {
				y = y + s2Arr[idxY1];
			}else {
				yBool = false;
			}
		}
		
		if(x.length() > y.length()) {
			
		}
		
		
		return answer;
	}*/
	
}
