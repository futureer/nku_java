package tool;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MonthDate {

	public static void main(String[] args) {
		Calendar calendar = GregorianCalendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		System.out.println(year + "Äê" + (month + 1) + "ÔÂ");

		//set the first day of week according to 'weekName'
		calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		String weekName = "Sun Mon Tue Wed Thu Fri Sat";
		
		// get the days in a month, iterate begin at the first day of the month.
		calendar.set(year, month, 1);
		int firstWeekName = calendar.get(Calendar.DAY_OF_WEEK);
		
		ArrayList<Integer> monthDays = new ArrayList<>();
		while (calendar.get(Calendar.MONTH) == month) {
			int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
			monthDays.add(dayOfMonth);
			calendar.add(Calendar.HOUR, 24); //advance one day towards the date
		}

		System.out.println(weekName);

		// print whitespace before the start of the month to occupy the space. 
		for (int i = 0; i < firstWeekName - 1; i++) {
			System.out.print("    ");
		}
		for (int j = 0; j < monthDays.size(); j++) {
			System.out.printf("%3d ", monthDays.get(j));
			if ((j + firstWeekName) % 7 == 0)
				System.out.println();
		}

	}
}
