package honux.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하세요.");
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.", num1, num2, num1 + num2);
		sc.close();
	}

}
