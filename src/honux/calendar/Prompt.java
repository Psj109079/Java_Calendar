package honux.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("���� �Է��ϼ��� ");
			System.out.print(PROMPT);
			int month = sc.nextInt();
			if (month == -1) {
				break;
			} else if (month > 12) {
				continue;
			}
			cal.printCalendar(2022, month);
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
