package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No25304 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		int n=Integer.parseInt(br.readLine());
		int price=0;
		for(int i=1;i<=n;i++) {
			String[] str=br.readLine().split(" ");
			int a=Integer.parseInt(str[0]);
			int b=Integer.parseInt(str[1]);
			price+=(a*b);
		}
		if(price==x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
