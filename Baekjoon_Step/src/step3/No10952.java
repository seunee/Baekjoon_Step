package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10952 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		int a=-1;
		int b=-1;
		while(a!=0&&b!=0) {
			StringTokenizer str=new StringTokenizer(br.readLine()," ");
			a=Integer.parseInt(str.nextToken());
			b=Integer.parseInt(str.nextToken());
			if(a==0&&b==0) break;
			System.out.println(a+b);			
			
		}
		

	}
	
}
