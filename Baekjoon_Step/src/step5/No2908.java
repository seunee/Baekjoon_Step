package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		String[] arr=br.readLine().split(" ");
		int a=Integer.parseInt(new StringBuilder(arr[0]).reverse().toString());
		int b=Integer.parseInt(new StringBuilder(arr[1]).reverse().toString());
		System.out.println(a>b?a:b);

	}

}
