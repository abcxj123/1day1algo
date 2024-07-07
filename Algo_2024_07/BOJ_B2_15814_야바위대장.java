import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B2_15814_야바위대장 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int len = str.length();
		
		char [] arr = new char[len];
		for (int i = 0; i < len; i++) {
			arr[i] = str.charAt(i);
		}
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			char tmp = arr[A];
			arr[A] = arr[B];
			arr[B] = tmp;
		}
		
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i]);
		}
		
	}

}
