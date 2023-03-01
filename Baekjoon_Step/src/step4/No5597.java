package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] arr=new boolean[31];
		for(int i=1;i<=28;i++) {
			arr[Integer.parseInt(br.readLine())]=true;
		}
		for(int i=1;i<=30;i++) {
			if(!arr[i]) {
				wr.write(String.valueOf(i)+"\n");
			}
		}
		wr.flush();
		wr.close();
	}
}
