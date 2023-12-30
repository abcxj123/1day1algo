import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_23303_이문제는D2입니다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		if(str.indexOf("D2") != -1 || str.indexOf("d2") != -1) {
			System.out.println("D2");
		} else {
			System.out.println("unrated");
		}

	}

}
