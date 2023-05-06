import java.util.Scanner;

public class BOJ_B2_1919_애너그램만들기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String str1 = scann.next();
		String str2 = scann.next();
		
		int [] arr1 = new int[26];
		int [] arr2 = new int[26];
		
		for (int i = 0; i < str1.length(); i++) {
			char c1 = str1.charAt(i);
			int tmp1 = c1 - 'a';
			
			arr1[tmp1]++;
		}
		
		for (int i = 0; i < str2.length(); i++) {
			char c2 = str2.charAt(i);
			int tmp2 = c2 - 'a';
			
			arr2[tmp2]++;
		}
		
		int ans = 0;
		
		for (int i = 0; i < 26; i++) {
			int n1 = arr1[i];
			int n2 = arr2[i];
			
			if(n1 == n2) continue;
			
			if(n1 > n2) {
				ans += n1-n2;
			} else {
				ans += n2-n1;
			}
		}
		
		System.out.println(ans);

	}

}
