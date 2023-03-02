package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10811 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr=br.readLine().split(" ");
		int n=Integer.parseInt(arr[0]);
		int m=Integer.parseInt(arr[1]);
		int[] numArr=new int[n];
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=i+1;
		}
		
		for(int i=0;i<m;i++) {
			String[] tmpArr=br.readLine().split(" ");
			int tmp=0;
			int a=Integer.parseInt(tmpArr[0])-1;
			int b=Integer.parseInt(tmpArr[1])-1;
			
			while(a<b) {
				tmp=numArr[a];
				numArr[a++]=numArr[b];
				numArr[b--]=tmp;
			}
		}
		
		for(int tmp:numArr) {
			wr.write(String.valueOf(tmp+" "));
		}
		wr.flush();
		wr.close();
	
	}

}
