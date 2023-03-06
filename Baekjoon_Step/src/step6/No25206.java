package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No25206 {
	
	//등급을 학점으로 바꾸는 메서드
	static double toScore(String grade) {
		double score=0;
		switch(grade) {
		case "A+": score=4.5; break;
		case "A0": score=4.0; break;
		case "B+": score=3.5; break;
		case "B0": score=3.0; break;
		case "C+": score=2.5; break;
		case "C0": score=2.0; break;
		case "D+": score=1.5; break;
		case "D0": score=1.0; break;
		case "F": score=0.0; break;
		}
		return score;
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double majorSum=0;
		double scoreSum=0;
		
		for(int i=0;i<20;i++) {
			String[] arr=br.readLine().split(" ");
			if(!(arr[2].equals("P"))){				
			double major=Double.parseDouble(arr[1]);
			majorSum+=major;
			//System.out.println("수강학점 합: "+majorSum);
				double score=toScore(arr[2]);
				scoreSum+=score*major;
				//System.out.println(arr[2]);
				//System.out.println("치훈이 학점 합: "+scoreSum);
			}else {
				//System.out.println(arr[2]);
				continue;
			}
			
		}
		System.out.printf("%.6f",scoreSum/majorSum);
	}

}
