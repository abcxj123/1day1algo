import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_6784_Multiple_Choice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		char [] arr1 = new char[N];
		char [] arr2 = new char[N];
		
		for (int i = 0; i < N; i++) {
			arr1[i] = br.readLine().charAt(0);
		}
		
		for (int i = 0; i < N; i++) {
			arr2[i] = br.readLine().charAt(0);
		}
		
		int ans = 0;
		
		for (int i = 0; i < N; i++) {
			if(arr1[i] == arr2[i]) ans++;
		}
		
		System.out.println(ans);
		
	}

}
