package step5;

import java.util.Scanner;

public class No9086 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			String a=scan.next();
			System.out.println(a.charAt(0)+""+a.charAt(a.length()-1));
		}
	}

}
