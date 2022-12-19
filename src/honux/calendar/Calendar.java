package honux.calendar;


public class Calendar {

	public static void main(String[] args) {

	}

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public boolean isLeapYear(int year) {
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;			
		}
	}
	public int getMaxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];			
		}
	}
	public int get_Days(String day) {
		 if(day.equals("SU")) {return 0;} 
		 else if(day.equals("MO")) {return 1;}
		 else if(day.equals("TU")) {return 2;}
		 else if(day.equals("WE")) {return 3;}
		 else if(day.equals("TH")) {return 4;}
		 else if(day.equals("FR")) {return 5;}
		 else if(day.equals("SA")) {return 6;}
		 else {return 0;}
	}
	public void printCalendar(int year, int month, String weekday) {
		System.out.printf("    <<%4d³â %3d¿ù>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		int maxDay = getMaxDaysOfMonth(year, month);
		int day = get_Days(weekday);
		int count = 7 - day;
		int delim = count < 7 ? count : 0; 
		
		//print blank space
		for(int i = 1; i <= day; i++) {
			System.out.print("   ");
		}
		
		// print first line
		for(int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		//print from second line to last
		count++;
		for(int i = count; i <= maxDay; i++) {
			System.out.printf("%3d", i);				
			if(i % 7 == delim) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println();
	}
}
