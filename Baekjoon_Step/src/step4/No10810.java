package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10810 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr1=br.readLine().split(" ");
		int n=Integer.parseInt(arr1[0]);
		int m=Integer.parseInt(arr1[1]);
		//System.out.println("N: "+n+"M: "+m);
		int[] arr2=new int[n];
		for(int i=0;i<m;i++) {
			String[] tmp=br.readLine().split(" ");
			int tmp1=Integer.parseInt(tmp[0]);
			int tmp2=Integer.parseInt(tmp[1]);
			int tmp3=Integer.parseInt(tmp[2]);
			for(int j=tmp1-1;j<=tmp2-1;j++) {
				arr2[j]=tmp3;
			}
		}
		for(int tmp:arr2) {
			
			wr.write(String.valueOf(tmp)+" ");
		}
		wr.flush();
		wr.close();
		
	}
}
