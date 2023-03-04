package step6;

import java.util.Scanner;

public class No2444 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			/* n=5
			 * i=1 일 때 별 1개 공백 4개
			 * i=2 일 때 별 3개 공백 3개
			 * i=3 일 때 별 5개 공백 2개... 
			 * 별=2*i-1개
			 * 
			 */
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
