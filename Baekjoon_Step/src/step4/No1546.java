package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(br.readLine());
		double[] arr=new double[n];
		double m=0;
		double sum=0;
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		for(int i=0;i<arr.length;i++) {		
			arr[i]=Integer.parseInt(st.nextToken());
			if(m<arr[i]) {m=arr[i];}
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]/m*100;
			sum+=arr[i];
		}
		wr.write(String.valueOf(sum/n));
		wr.flush();
		wr.close();
	}
}
