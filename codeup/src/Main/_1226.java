package Main;

import java.util.Scanner;

public class _1226 {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {13,23,24,35,40,45,7};

		System.out.println();

		Object 당첨로또번호;
		for (int i = 0; i < 당첨로또번호.length; i++) {
			System.out.println(당첨로또번호[i] + " ");
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("로또번호 입력: ");
		int num = sc.nextInt();
		if( num == 당첨로또번호 )
			System.out.println("당첨되었습니다.");
		else
			System.out.println("꽝");
		
		}
}

	


