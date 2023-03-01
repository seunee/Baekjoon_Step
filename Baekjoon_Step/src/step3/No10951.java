package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null) {
			StringTokenizer strn=new StringTokenizer(str," ");
			int a=Integer.parseInt(strn.nextToken());
			int b=Integer.parseInt(strn.nextToken());
			System.out.println(a+b);						
		}

		
		
	}

}
