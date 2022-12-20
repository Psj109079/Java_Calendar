package honux.calendar;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt {
	
	public void printMenu() {
		System.out.println("+-------------------+");
		System.out.println("| 1. ���� ���");
		System.out.println("| 2. ���� �˻�");
		System.out.println("| 3. �޷� ����");
		System.out.println("| h. ���� q. ����");
		System.out.println("+-------------------+");
	}
	public void runPrompt() throws ParseException {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		
		
		printMenu();
		while (true) {
			System.out.println("��� (1, 2, 3, h, q)");
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
		System.out.println("�⵵�� �Է��ϼ���.");
		System.out.print("YEAR> ");
		year = s.nextInt();
		
		System.out.println("���� �Է��ϼ���.");
		System.out.print("MONTH> ");
		month = s.nextInt();
		if (month > 12 || month < 1) {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		
		c.printCalendar(year, month);
		
	}
	private void cmdSearch(Scanner s, Calendar c) {
		System.out.println("[���� �˻�]");
		System.out.println("��¥�� �Է����ּ���. (yyyy-MM-dd)");
		String date = s.next();
		String plan = "";
		try {
			plan = c.searchPlan(date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.out.println("���� �˻� �� ������ �߻��߽��ϴ�.");
		}
		System.out.println(plan);
	}
	private void cmdRegister(Scanner s, Calendar c) throws ParseException {
		System.out.println("[�� ���� ���]");
		System.out.println("��¥�� �Է����ּ���. (yyyy-MM-dd)");
		String date = s.next();
		String text = "";
		s.nextLine();
		System.out.println("������ �Է����ּ���. (������ ���� ;�� �Է��� �ּ���.) ");
		text = s.nextLine();
		c.registerPlan(date, text);
		
	}
	public static void main(String[] args) throws ParseException {
		// �� ����
		Prompt p = new Prompt();
		p.runPrompt();
		
	}

}
