import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Str implements Comparable<Str> {
	String str;

	public Str(String str) {
		this.str = str;
	}

	public int compareTo(Str o) {
		if(this.str.length() != o.str.length()) {
			return Integer.compare(this.str.length(), o.str.length());
		}
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < this.str.length(); i++) {
			int n1 = this.str.charAt(i) - '0';
			int n2 = o.str.charAt(i) - '0';
			if(n1 >= 0 && n1 <= 9) {
				sum1 += n1;
			}
			if(n2 >= 0 && n2 <= 9) {
				sum2 += n2;
			}
		}
		if (sum1 != sum2) {
			return sum1 - sum2;
		} else {
			return this.str.compareTo(o.str);
		}
	}
	
}

public class BOJ_S3_1431_시리얼넘버 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Str [] arr = new Str[N];
		
		for (int i = 0;i < N; i++) {
			arr[i] = new Str(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i].str);
		}

	}

}
