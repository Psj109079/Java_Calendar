package honux.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է��ϼ���.");
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		System.out.println("�� ���� ���� " + (num1 + num2) + "�Դϴ�.");
		System.out.printf("%d�� %d�� ���� %d�Դϴ�.", num1, num2, num1 + num2);
		sc.close();
	}

}
