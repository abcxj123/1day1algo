import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_G5_12904_A와B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		StringBuilder T = new StringBuilder(br.readLine());
		
		// T를 변환시켜서 S의 길이까지 맞춘다.
		for (int i = T.toString().length()-1; i >= S.length(); i--) {
			// A로 끝난다면 맨 뒤 글자를 지운다.
			if(T.charAt(i) == 'A') {
				T.deleteCharAt(i);
			// B로 끝난다면 맨 뒤 글자를 지우고 뒤집는다.	
			} else {
				T.deleteCharAt(i);
				T = T.reverse();
			}
		}
		
		if(S.equals(T.toString())) System.out.println(1);
		else System.out.println(0);
		
	}

}
