import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_B3_20944_팰린드롬척화비 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		char [] arr = new char[N];

		Arrays.fill(arr, 'a');

		sb.append(arr);
		System.out.println(sb.toString());
	}
}
