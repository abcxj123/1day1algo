import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_S5_1427_소트인사이드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int leng = str.length();
		Integer [] arr = new Integer[leng];
		
		for (int i = 0; i < leng; i++) {
			char c = str.charAt(i);
			int n = c - '0';
			arr[i] = n;
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for (int n : arr) {
			System.out.print(n);
		}

	}

}
