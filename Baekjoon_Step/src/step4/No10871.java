package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(str.nextToken());
		int x=Integer.parseInt(str.nextToken());
		
		String[] str2=new String[n];
		str2=br.readLine().split(" ");
		for(int i=0;i<str2.length;i++) {
			if(Integer.parseInt(str2[i])<x) {
				System.out.print(str2[i]+" ");
			}
		}			
	}
}
