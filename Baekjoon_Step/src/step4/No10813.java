package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No10813 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		
		for(int i=0;i<m;i++) {
			String[] tmpArr=br.readLine().split(" ");
			int tmp=0;
			tmp=arr[Integer.parseInt(tmpArr[0])-1];
			arr[Integer.parseInt(tmpArr[0])-1]=arr[Integer.parseInt(tmpArr[1])-1];
			arr[Integer.parseInt(tmpArr[1])-1]=tmp;
		}
		for(int tmp:arr) {
			wr.write(String.valueOf(tmp)+" ");
			
		}
		wr.flush();
		wr.close();
	}

}
