package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr=new int[42];
		for(int i=1;i<=10;i++) {
			int n=(Integer.parseInt(br.readLine()))%42;
			arr[n]++;
		}
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				cnt++;
			}
		}
		wr.write(String.valueOf(cnt));
		wr.flush();
		wr.close();
	}
}
