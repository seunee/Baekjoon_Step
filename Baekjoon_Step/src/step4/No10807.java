package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10807 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt=0;
		int n=Integer.parseInt(br.readLine());
		String str[]=br.readLine().split(" ");
		String v=br.readLine();
		for(String tmp:str) {
			if(tmp.equals(v)) {
				cnt++;
			}
		}
		wr.write(String.valueOf(cnt));
		wr.flush();
		wr.close();
	}


}
