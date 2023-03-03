package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2675 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t=Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++) {
			String[] arr=br.readLine().split(" ");
			int r=Integer.parseInt(arr[0]);
			
			for(int j=0;j<arr[1].length();j++) {
				for(int k=1;k<=r;k++) {
					System.out.print(arr[1].charAt(j));
				}
			}
			System.out.println();
		}
		

	}

}
