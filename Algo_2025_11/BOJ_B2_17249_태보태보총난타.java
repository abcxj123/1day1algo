import java.util.Scanner;
import java.util.regex.Pattern;

public class BOJ_B2_17249_태보태보총난타 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String [] arr = scann.nextLine().split(Pattern.quote("(^0^)"));
					
		if(arr.length >= 1) {			
			arr[0] = arr[0].replace("=", "");
		}
		
		if(arr.length == 2) {			
			arr[1] = arr[1].replace("=", "");
		}
		
		int left = arr.length < 1 ? 0 : arr[0].length();
		int right = arr.length < 2 ? 0 : arr[1].length();
		
		System.out.println(left+" "+right);

	}

}
