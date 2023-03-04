package step6;

import java.util.Scanner;

public class No10988 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String word=scan.next();
		int flag=1;
		for(int i=0;i<Math.floor(word.length()/2);i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i)) {
				flag=0;
				break;
			}
		}
		System.out.println(flag);
		
		
		//StringBuilder 사용
		int flag2=1;
		for(int i=0;i<word.length()/2;i++) {
			if(word.charAt(i)!=new StringBuilder(word).reverse().charAt(i)) {
				flag2=0;
				break;
			}
		}
		System.out.println(flag2);

	}

}
