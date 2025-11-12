import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_14582_오늘도졌다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr1 = new int[9];
		int [] arr2 = new int[9];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 9; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 9; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean check = false;
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < 9; i++) {
			sum1 += arr1[i];
			
			if(sum1 > sum2) {
				check = true;
				break;
			}
			
			sum2 += arr2[i];
		}
		
		if(check) System.out.println("Yes");
		else System.out.println("No");
		
	}

}
