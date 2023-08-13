package testAnswer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String buttons[] = {"v>AB^CYv^XA","<v>A","^XAZ","Yv^XA",">AB^"};
		int scores[] = {50, 18, 20, 30, 25};
		int x = solution("<v>AB^CYv^XAZ", buttons, scores);
		System.out.println(x);

	}
	static int maxScore = 0;
	static HashMap<String, Integer> skill = new HashMap();
	static public int solution(String command, String[] buttons, int[] scores) {
		int answer = 0;
		maxScore = scores.length;
		
		
		for(int num = 0; num < buttons.length; num++) {
			String button	= buttons[num];
			int score		= scores[num];
			
			skill.put(button, score);
		}
		
		dfs(command.length(), 0, command, null);
		
		answer = maxScore;
		return answer;
	}
	
	static public void dfs(int length, int score, String command, HashMap<String, Integer> mySkill) {
		if(command.equals("")) {
			maxScore = maxScore < score ? score : maxScore;
			mySkill = null;
			return;
		}
		
		HashMap<String, Integer> newSkill = (HashMap<String, Integer>) mySkill.clone();
		
		
		Iterator<String> keys = newSkill.keySet().iterator();

		while(keys.hasNext()) {
			String button		= keys.next();
			int buttonScore		= newSkill.get(button);
			
			int buttonIndex = command.indexOf(button);
			
			int sumScore 			= 0;
			int strIdx	 			= command.length();
			String remainCommand 	= "";
			
			if(buttonIndex == -1) {
				sumScore = score + command.length();
				remainCommand = "";
				
			}
			else {
				newSkill.remove(button);
				sumScore = score + buttonScore + buttonIndex;
				strIdx = buttonIndex + button.length();
				remainCommand = command.substring(strIdx);
			}
			
			dfs(length, sumScore, remainCommand, newSkill);
		}
	}

}
