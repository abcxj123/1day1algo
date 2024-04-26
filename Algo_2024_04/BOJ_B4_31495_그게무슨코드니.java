import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_31495_그게무슨코드니 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		if(str.length() <= 1) {
			System.out.println("CE");
			System.exit(0);
		}
		
		char c1 = str.charAt(0);
		char c2 = str.charAt(str.length()-1);
		
		if(c1 != '"' || c2 != '"') {
			System.out.println("CE");
		} else if(str.equals("\"\"")) {
			System.out.println("CE");
		} else {
			System.out.println(str.substring(1, str.length()-1));
		}

	}

}
