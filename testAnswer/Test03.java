package testAnswer;

import java.util.regex.Pattern;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneReg = "^010\\d{8}$";
		
		System.out.println(Pattern.matches(phoneReg, "01046669641"));
	}

	
	public int solution(String phone_number) {
		int answer = 0;
		
		String phoneReg1 = "^010\\d{8}$";
		String phoneReg2 = "^010-\\d{4}-\\d{4}$";
		String phoneReg3 = "^+82-10-\\d{4}-\\d{4}$";
		
		
		
		
		if(Pattern.matches(phoneReg2, phone_number)) {
			answer = 1;
		}
		else if(Pattern.matches(phoneReg1, phone_number)) {
			answer = 2;
		}
		else if(Pattern.matches(phoneReg3, phone_number)) {
			answer = 3;
		}
		else {
			answer = -1;
		}
		
		return answer;
	}
}
