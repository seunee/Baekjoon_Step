package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		int[] nArr=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<nArr.length;i++) {
			nArr[i]=Integer.parseInt(st.nextToken());
		}
		int max=nArr[0];
		int min=nArr[0];
		for(int i=0;i<nArr.length;i++) {
			if(max<nArr[i]) {
				max=nArr[i];
			}
			if(min>nArr[i]) {
				min=nArr[i];
			}
		}
		wr.write(String.valueOf(min)+" "+String.valueOf(max));
		wr.flush();
		wr.close();
	}
}
