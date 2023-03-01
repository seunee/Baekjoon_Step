package step2;

import java.util.Scanner;

public class No2884 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		int h=scan.nextInt();
		int m=scan.nextInt();
		
		if(m>=45) {
			System.out.println(h+" "+(m-45));
		}else {
			if(h==0) {
				h=24;
			}
			System.out.println((h-1)+" "+(m+15));
		}
		
	}


}
