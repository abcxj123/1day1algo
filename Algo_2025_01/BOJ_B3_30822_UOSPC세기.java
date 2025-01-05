import java.util.Scanner;

public class BOJ_B3_30822_UOSPC세기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		scann.nextLine();
		
		int [] arr = new int[5];
		
		String str = scann.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == 'u') arr[0]++;
			else if(c == 'o') arr[1]++;
			else if(c == 's') arr[2]++;
			else if(c == 'p') arr[3]++;
			else if(c == 'c') arr[4]++;
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < 5; i++) {
			min = Math.min(min, arr[i]);
		}
		
		System.out.println(min);

	}

}
