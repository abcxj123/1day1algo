import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_14490_백대열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] arr = br.readLine().split(":");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		
		int GCD = calGCD(num1, num2);
		
		System.out.println((num1/GCD)+":"+(num2/GCD));

	}

	private static int calGCD(int num1, int num2) {
		if(num1 % num2 == 0) {
			return num2;
		}
		
		return calGCD(num2, num1 % num2);
	}

}
