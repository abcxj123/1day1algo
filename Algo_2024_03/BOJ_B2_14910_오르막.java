import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_14910_오르막 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] arr = br.readLine().split(" ");
		
		boolean check = true;
		int past = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			int n = Integer.parseInt(arr[i]);
			if(n < past) {
				check = false;
				break;
			}
			
			past = n;
		}
		
		if(check) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
		
	}

}
