import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_20499_Darius님한타안함 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String [] arr = str.split("/");
		
		int K = Integer.parseInt(arr[0]);
		int D = Integer.parseInt(arr[1]);
		int A = Integer.parseInt(arr[2]);
		
		if(K + A < D || D == 0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}

	}

}
