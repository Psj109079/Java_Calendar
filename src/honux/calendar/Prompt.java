package honux.calendar;

import java.util.Scanner;

public class Prompt {
	
	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month, year = 0;
		String weekday = "";

		while (true) {
			System.out.println("�⵵�� �Է��ϼ��� (exit : -1)");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			if(year == -1) {break;}
			
			System.out.println("���� �Է��ϼ��� ");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			if (month > 12 || month < 1) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			
			System.out.println("ù��° ������ �Է��ϼ���. (SU, MO, TU, WE, TH, FR, SA)");
			System.out.print("WEEKDAY> ");
			weekday = sc.next();
			
			cal.printCalendar(year, month, weekday);
		}

		System.out.println("Bye~");
		sc.close();
	}

	public static void main(String[] args) {
		// �� ����
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
