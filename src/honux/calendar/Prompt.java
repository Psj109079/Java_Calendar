package honux.calendar;

import java.util.Scanner;

public class Prompt {
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month, year = 0;

		while (true) {
			System.out.println("년도를 입력하세요 (exit : -1)");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			if(year == -1) {break;}
			
			System.out.println("월을 입력하세요 ");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			cal.printCalendar(year, month);
		}

		System.out.println("Bye~");
		sc.close();
	}

	public static void main(String[] args) {
		// 셸 실행
		Prompt p = new Prompt();
		p.runPrompt();
		
	}

}
