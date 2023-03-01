package step2;

import java.util.Scanner;

public class No2480 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		if(a==b&&a==c) {
			System.out.println((1000*a)+10000);
		}else if(a==c||a==b) {
			System.out.println((100*a)+1000);
		}else if(b==c) {
			System.out.println((100*b)+1000);			
		}else {
			int max=Math.max(a, Math.max(b, c));
			System.out.println((max*100));
		}
		 
	}

}
