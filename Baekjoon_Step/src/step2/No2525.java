package step2;

import java.util.Scanner;

public class No2525 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		 int a=scan.nextInt();
		 int b=scan.nextInt();
		 int c=scan.nextInt();
		 
		 int total=(a*60)+b+c;
		 int h=total/60;
		 int m=total%60;
		 
		 if(h>=24) {
			 h-=24;
		 }
		 System.out.println(h+" "+m);
		 
	}


}
