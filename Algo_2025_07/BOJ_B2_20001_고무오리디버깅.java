import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_20001_고무오리디버깅 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String start = br.readLine();
		String input;
		int cnt = 0;
		
		while((input = br.readLine()) != null) {
			if(input.equals("문제")) {
				cnt++;
			} else if(input.equals("고무오리")) {
				if(cnt == 0) cnt += 2;
				else cnt--;
			} else {
				break;
			}
		}
		
		if(cnt == 0) System.out.println("고무오리야 사랑해");
		else System.out.println("힝구");
		
	}

}
