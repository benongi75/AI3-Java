package Main;

import java.util.Scanner;

public class _1121 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력하세요.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int 나머지 = a % b;
		System.out.println(a + " / " + b + "의 나머지");
		
		sc.close();

		
	}

}
