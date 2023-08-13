package testAnswer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(addHours("2019/05/01 00:59:19", 9));
		
		String logs="2019/05/01 00:59:19\n" + 
				"2019/06/01 01:35:20\n" + 
				"2019/08/01 02:01:22\n" + 
				"2019/08/01 02:01:23\n" + 
				"2019/08/02 03:02:35\n" + 
				"2019/10/03 04:05:40\n" + 
				"2019/10/04 06:23:10\n" + 
				"2019/10/10 08:23:20\n" + 
				"2019/10/12 08:42:24\n" + 
				"2019/10/23 08:43:26\n" + 
				"2019/11/14 08:43:29\n" + 
				"2019/11/01 10:19:02\n" + 
				"2019/12/01 11:23:10";
		
		solution(logs);
	}
	
	private static final String DEFAULT_FMT = "yyyy/MM/dd HH:mm:ss";
	
	static public int[] solution(String logs) {
		int[] answer = new int[24];
		
		// �ʱ�ȭ
		for(int num = 0; num <24; num++) {
			answer[num] = 0;
		}
		
		String[] logArr = logs.split("\n");
		
		for(int num = 0; num < logArr.length; num++) {
			String log = logArr[num];
			Calendar cal = addHoursNGetCalendar(log, 9);
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			System.out.println(hour);
		}
		
		return answer;
	}
	
	static final Calendar addHoursNGetCalendar (String dateStr, int amount) {
		DateFormat sdf = new SimpleDateFormat (DEFAULT_FMT);
	
		Calendar c = Calendar.getInstance();
		try
		{
			c.setTime (sdf.parse (dateStr));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		c.add (Calendar.HOUR, amount);
		
		return c;
	}

}
