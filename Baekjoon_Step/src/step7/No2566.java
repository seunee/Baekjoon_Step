package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr=new int[9][9];
		
		for(int i=0;i<9;i++) {
			String[] tmp=br.readLine().split(" ");
			for(int j=0;j<9;j++) {
				arr[i][j]=Integer.parseInt(tmp[j]);
			}
		}
		
		int max=0, iNum=0, jNum=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
					iNum=i;
					jNum=j;
				}
			}
		}
		System.out.println(max);
		System.out.println((iNum+1)+" "+(jNum+1));
		
		
	}

}
