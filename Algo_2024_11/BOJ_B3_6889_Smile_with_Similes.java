import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_6889_Smile_with_Similes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		String [] arr1 = new String[N];
		String [] arr2 = new String[M];
		
		for (int i = 0; i < N; i++) {
			arr1[i] = br.readLine();
		}
		
		for (int i = 0; i < M; i++) {
			arr2[i] = br.readLine();
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.println(arr1[i]+" as "+arr2[j]);
			}
		}
		
	}

}
