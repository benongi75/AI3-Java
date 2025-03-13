package Main;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class _ex01 {
	public static void main(String[] args) throws Exception {
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
		
			
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String x = a % 2 == 1 ? "홀수" : "짝수";
		String y = b % 2 == 1 ? "홀수" : "짝수";
		String z = x.equals(y) ? "짝수" : "홀수";
		
		System.out.println(x + "+" + y + "=" + z);
        
		sc.close();		
	}

}
