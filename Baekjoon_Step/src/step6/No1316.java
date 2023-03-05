package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1316 {
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static boolean checkGroup() throws IOException {
		boolean[] isGroup=new boolean[26];
		int prevWord=0;
		String word=br.readLine();
		
		for(int i=0;i<word.length();i++) {
			if(prevWord!=word.charAt(i)) {	//앞 글자와 현재 글자가 다르면
				if(isGroup[word.charAt(i)-'a']==false) {	//전에 나왔는지 체크(false: 전에 한 번도 나오지 않음)
					isGroup[word.charAt(i)-'a']=true;	//나왔으므로 true로 변경
					prevWord=word.charAt(i);	//현재 글자로 앞 글자 변경
				}else {	//전에 나왔던 글자라면 false
					return false;
				}
			}
		}
		
		return true;
		
	}

	public static void main(String[] args) throws IOException {

		//단어 길이만큼 for문 순회
		//앞의 글자를 변수에 담아놓고 다음 글자와 계속 비교 -> 앞 글자랑 다르면 boolean 배열 값 true로 바꾸기(false일 때만)
		int n=Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0;i<n;i++) {
			if(checkGroup()) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}
}