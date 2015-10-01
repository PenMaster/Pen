package calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class myCalender {
	public myCalender(int a, int b, int c){
		this.month = a;
		this.day = b;
		this.year = c;
	}
	public void setDate(){
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, (month-1));
		calendar.set(Calendar.DAY_OF_MONTH, day);
		weekNum = calendar.get(Calendar.DAY_OF_WEEK);
	}
	public String getDay(){
		if (weekNum == 1)
			weekDay = "Sunday";
		else if (weekNum == 2)
			weekDay = "Monday";
		else if (weekNum == 3)
			weekDay = "Tuesday";
		else if (weekNum == 4)
			weekDay = "Wednesday";
		else if (weekNum == 5)
			weekDay = "Thursday";
		else if (weekNum ==  6)
			weekDay = "Friday";
		else if (weekNum == 7)
			weekDay = "Saturday";
		else
			return "error";
		return weekDay;
	}

private int month;
private int day;
private int year;
private String weekDay;
private int weekNum;
private Calendar calendar = new GregorianCalendar();
}
