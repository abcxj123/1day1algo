import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S4_1639_행운의티켓 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int length = str.length()/2;
		int size = str.length() % 2 == 0 ? 1 : 2;
		
		while(length >= 1) {
			for (int i = 0; i < size; i++) {
				int left = 0;
				int right = 0;
				
				for (int j = i; j < i+length; j++) {
					int n = str.charAt(j);
					left += n;
				}
				for (int j = i+length; j < i+length*2; j++) {
					int n = str.charAt(j);
					right += n;
				}
				
				if(left == right) {
					System.out.println(length * 2);
					System.exit(0);
				}
			}
			size += 2;
			length--;
		}
		
		System.out.println(0);
		
	}

}
