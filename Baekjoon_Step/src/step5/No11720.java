package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No11720 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(br.readLine());
		String[] strArr=new String[n];
		strArr=br.readLine().split("");
		int sum=0;
		for(int i=0;i<strArr.length;i++) {
			sum+=Integer.parseInt(strArr[i]);
		}
		wr.write(String.valueOf(sum));
		wr.flush();
		wr.close();
	}

}
