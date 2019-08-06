package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		int sum = 0;
		int k;
		
		if(num%2==0) k=2;
		else k=1;
		
		for (int i = k; i <= num; i+=2) {
			sum+=i;
		}
		
		System.out.println(sum);
		sc.close();
	}
}
