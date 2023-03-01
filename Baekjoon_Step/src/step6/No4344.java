package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());

		for(int i=0;i<n;i++) {
			String score[]=br.readLine().split(" ");
			int sum=0;
			double avg=0;
			double cnt=0;
			double ratio=0;
			int stuNum=Integer.parseInt(score[0]);
			
			for(int j=1;j<score.length;j++) {
				sum+=Integer.parseInt(score[j]);				
			}
			avg=(double)sum/stuNum;
			
			for(int k=1;k<score.length;k++) {
				if(Integer.parseInt(score[k])>avg) {
					cnt++;
				}
				ratio=(cnt/stuNum)*100;
			}
			System.out.printf("%.3f%%\n",ratio);
		}

	}
}
