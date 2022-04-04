package simpli.learn;

import java.util.Calendar;

public class CalendarEx {
	
		public static void main(String[] args) {
			Calendar cal = Calendar.getInstance();
			System.out.println("The current date :" +cal.getTime());
			cal.add(Calendar.DATE, +15);
			System.out.println("15 days after :" +cal.getTime());
		}

	}
	 

