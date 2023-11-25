import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B5_20492_세금 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int n1 = N / 100 * 78;
		int n2 = (N / 5 * 4) + (N / 500 * 78);
		
		System.out.println(n1+" "+n2);
		
	}

}
