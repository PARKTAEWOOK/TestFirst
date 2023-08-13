package testAnswer;

import java.util.HashMap;
import java.util.Map;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infos[] = {"kim password", "lee abc"};
		String actions[] = {
		                  "ADD 30", 
		                  "LOGIN kim abc", 
		                  "LOGIN lee password", 
		                  "LOGIN kim password", 
		                  "LOGIN kim password", 
		                  "LOGIN lee abc", 
		                  "ADD 30", 
		                  "ORDER",
		                  "ORDER",
		                  "ADD 40",
		                  "ADD 50"
		};
		
		solution(infos, actions);
		
		
		
	}
	
	static String loginedInfo					= "";
	static long cartCnt							= 0;
	static Map<String, String> memberInfo		= new HashMap();
	
	public static boolean[] solution(String[] infos, String[] actions) {
		boolean[] answers = new boolean[actions.length];
		
		getMember(infos); // ���� ����
		
		for(int num = 0; num < actions.length; num++) {
			boolean answer = false;
			String command = actions[num];
			
			if(command.startsWith("LOGIN")) {
				answer = loginCommand(command);
			}
			else if(command.startsWith("ADD")) {
				answer = cartCommand(command);
			}
			else if(command.equals("ORDER")) {
				answer = orderCommand(command);
			}
			
			answers[num] = answer;
			System.out.println(answer);
		}
		
		return answers;
	}
	
	static void getMember(String[] infos) {
		for(int num = 0; num < infos.length; num++) {
			String info = infos[num];
			
			String id		= info.split(" ")[0];
			String passwd	= info.split(" ")[1];
			
			memberInfo.put(id, passwd);
		}
	}
	
	static boolean loginCommand(String command) {
		boolean answer;
		
		String id		= command.split(" ")[1];
		String passwd	= command.split(" ")[2];
		
		Boolean logined	= loginedInfo.isEmpty() == false;
		
		if(logined) { // �̹� �α���
			return false;
		}
		
		String memberPasswd = memberInfo.get(id);
		
		if(memberPasswd == null) { // ���̵� ���� ������
			answer = false;
		}
		else if(memberPasswd.equals(passwd)) { //�α�
			loginedInfo = id;
			answer = true;
		}
		else { // ��� ����ġ
			answer = false;
		}
		return answer;
	}
	
	static boolean cartCommand(String command) {
		boolean answer;
		
		long cnt = Long.valueOf(command.split(" ")[1]);
		
		if(loginedInfo.isEmpty()) {
			answer = false;
		}
		else {
			cartCnt += cnt;
			answer = true;
		}
		
		return answer;
	}
	
	static boolean orderCommand(String command) {
		boolean answer;
		
		if(cartCnt > 0) {
			answer = true;
			cartCnt = 0;
		}
		else {
			answer = false;
		}
		return answer;
	}
}
