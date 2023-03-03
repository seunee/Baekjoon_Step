package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10809 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr=new int[26];
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
		
		String word=br.readLine();
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(arr[ch-'a']==-1) {
				arr[ch-'a']=i;				
			}
		}
		
		for(int tmp:arr) {
			wr.write(String.valueOf(tmp)+" ");
		}
		wr.flush();
		wr.close();
	
	}

}
