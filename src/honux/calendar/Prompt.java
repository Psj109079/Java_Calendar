package honux.calendar;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {
	
	public void printMenu() {
		System.out.println("+-------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+-------------------+");
	}
	public void runPrompt() throws ParseException {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		
		
		printMenu();
		while (true) {
			System.out.println("명령 (1, 2, 3, h, q)");
			String cmd = sc.next();
			if(cmd.equals("1")) {cmdRegister(sc, cal);} 
			else if(cmd.equals("2")) {cmdSearch(sc, cal);} 
			else if(cmd.equals("3")) {cmdCal(sc, cal);}
			else if(cmd.equals("h")) {printMenu();}
			else if(cmd.equals("q")) {break;}
			
		}

		System.out.println("Thank you. Bye~");
		sc.close();
	}

	private void cmdCal(Scanner s, Calendar c) {
		int month, year = 0;
		System.out.println("년도를 입력하세요.");
		System.out.print("YEAR> ");
		year = s.nextInt();
		
		System.out.println("월을 입력하세요.");
		System.out.print("MONTH> ");
		month = s.nextInt();
		if (month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		c.printCalendar(year, month);
		
	}
	private void cmdSearch(Scanner s, Calendar c) {
		System.out.println("[일정 검색]");
		System.out.println("날짜를 입력해주세요. (yyyy-MM-dd)");
		String date = s.next();
		String plan = "";
		try {
			plan = c.searchPlan(date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("일정 검색 중 오류가 발생했습니다.");
		}
		System.out.println(plan);
	}
	private void cmdRegister(Scanner s, Calendar c) throws ParseException {
		System.out.println("[새 일정 등록]");
		System.out.println("날짜를 입력해주세요. (yyyy-MM-dd)");
		String date = s.next();
		String text = "";
		s.nextLine();
		System.out.println("일정을 입력해주세요. (문장의 끝에 ;을 입력해 주세요.) ");
		text = s.nextLine();
		c.registerPlan(date, text);
		
	}
	public static void main(String[] args) throws ParseException {
		// 셸 실행
		Prompt p = new Prompt();
		p.runPrompt();
		
	}

}
