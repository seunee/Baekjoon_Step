package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2738 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] strArr=br.readLine().split(" ");
		int n=Integer.parseInt(strArr[0]);
		int m=Integer.parseInt(strArr[1]);
		
		int[][] arr1=new int[n][m];
		int[][] arr2=new int[n][m];
		
		for(int i=0;i<arr1.length;i++) {
			String[] tmp=br.readLine().split(" ");
			for(int j=0;j<arr1[0].length;j++) {
				arr1[i][j]=Integer.parseInt(tmp[j]);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			String[] tmp=br.readLine().split(" ");
			for(int j=0;j<arr2[0].length;j++) {
				arr2[i][j]=Integer.parseInt(tmp[j]);
			}
		}
		
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				System.out.print((arr1[i][j]+arr2[i][j])+" ");
			}
			System.out.println();
		}
	}

}
