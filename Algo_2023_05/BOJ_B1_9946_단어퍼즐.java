import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_9946_단어퍼즐 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = 1;
		while(true) {
			String str1 = br.readLine();
			String str2 = br.readLine();
			
			if(str1.equals("END") && str2.equals("END")) {
				break;
			} else if(str1.length() != str2.length()) {
				sb.append("Case "+(T++)+": different\n");
				continue;
			}
			
			int [] arr1 = new int[26];
			int [] arr2 = new int[26];
		
			for (int i = 0; i < str1.length(); i++) {
				char c1 = str1.charAt(i);
				char c2 = str2.charAt(i);
				arr1[c1-'a']++;
				arr2[c2-'a']++;
			}
			
			boolean check = true;
			for (int i = 0; i < arr2.length; i++) {
				if(arr1[i] != arr2[i]) {
					check = false;
					break;
				}
			}
			if(check) {
				sb.append("Case "+(T++)+": same\n");
			} else {
				sb.append("Case "+(T++)+": different\n");
			}
			
		}
		
		sb.setLength(sb.length()-1);
		
		System.out.println(sb.toString());

	}

}
