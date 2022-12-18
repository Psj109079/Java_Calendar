package honux.calendar;

import java.util.Scanner;

public class Prompt {

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 0;
		int year = 0;

		while (true) {
			System.out.println("�⵵�� �Է��ϼ���");
			System.out.print("YEAR> ");
			year = sc.nextInt();
			System.out.println("���� �Է��ϼ��� ");
			System.out.print("MONTH> ");
			month = sc.nextInt();
			if (month == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
			cal.printCalendar(year, month);
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
