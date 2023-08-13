package testAnswer;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test ="test1";
		System.out.println(test.length()/2);
		
		System.out.println(solution(12521));
	}
	
	static public boolean solution(int n) {
		boolean answer = false;
		
		String str = String.valueOf(n);
		
		int mid = str.length() / 2;
		
		String s1 = str.substring(0, mid);
		StringBuilder s2 = new StringBuilder( str.substring(str.length() - mid, str.length())).reverse();
			
		System.out.println(s1);
		System.out.println(s2);
		if(s1.equals(s2.toString())) {
			answer = true;
		}
		
		
		return answer;
	}

}
