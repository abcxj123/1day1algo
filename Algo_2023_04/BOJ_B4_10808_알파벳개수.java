import java.util.Scanner;

public class BOJ_B4_10808_알파벳개수 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str = scann.next();
		int [] arr = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int n = c - 'a';
			arr[n]++;
		}
		
		for (int i = 0; i < 26; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
