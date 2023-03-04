package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class No10812 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int[] basket=new int[n];
		for(int i=0;i<basket.length;i++) {
			basket[i]=i+1;
		}
		
		int[] tmp=new int[n];
		
		
		
//		for(int i=0;i<m;i++) {
//			String[] arr=br.readLine().split(" ");
//			int begin=Integer.parseInt(arr[0]);
//			int end=Integer.parseInt(arr[1]);
//			int mid=Integer.parseInt(arr[2]);
//			for(int j=mid;j<end-mid+1;j++) {
//				tmp[]
//			}
//		}
	}

}
