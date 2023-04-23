import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B5_10951_AB4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		while((str = br.readLine()) != null) {
			String [] arr = str.split(" ");
			
			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);
			
			System.out.println(A+B);
			
		}
	}

}
