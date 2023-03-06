package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2941 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] croa= {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String word=br.readLine();
		for(int i=0;i<croa.length;i++) {
			if(word.contains(croa[i])) {
				word=word.replace(croa[i], "*");
			}
		}
		System.out.println(word.length());
	}

}
