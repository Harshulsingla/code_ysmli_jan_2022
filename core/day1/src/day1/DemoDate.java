package day1;

public class DemoDate {

	public static void main(String[] args) {
		// isLeapYear

		// daysInMonth
		
		int day, month, year;
		day=28;
		month=2;
		year=2001;
		System.out.println("date is : "+ day+" / "+ month + " / "+ year);
		day=day+1;
	
		if(day> noOfDaysInMonth(month, year)) {
			day=1;
			month++;
			if(month>12) {
				month=1;
				year++;
			}
		}
		System.out.println("date is : "+ day+" / "+ month + " / "+ year);
		
	}

	public static int noOfDaysInMonth(int month, int year) {
		int noOfDaysInMonth[] = { -1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (isLeapYear(year)) {
			noOfDaysInMonth[2] = 29;
		}
		if (month >= 1 && month <= 12)
			return noOfDaysInMonth[month];
		else
			return -1;
	}

	public static boolean isLeapYear(int year) {
		if ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0))
			return true;
		else
			return false;

	}
}
