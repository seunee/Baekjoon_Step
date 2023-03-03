package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1157 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr=new int[26];
		String word=br.readLine();
		for(int i=0;i<word.length();i++) {
			if('A'<=word.charAt(i)&&word.charAt(i)<='Z') {
				arr[word.charAt(i)-'A']++;
			}else {
				arr[word.charAt(i)-'a']++;
			}
		}
		
		int max=0;
		char ch='?';
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				ch=(char)(i+'A');
			}else if(arr[i]==max) {
				ch='?';
			}
		}
		
		System.out.println(ch);
	}

}
