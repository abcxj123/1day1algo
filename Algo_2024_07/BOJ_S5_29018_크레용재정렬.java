import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_S5_29018_크레용재정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("#")) break;
			
			List<Character> list = new ArrayList<>();
			List<Character> list2 = new ArrayList<>();
			List<Character> list3 = new ArrayList<>();
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				
				if(c >= 'a' && c <= 'z') list.add(c);
				else if(c >= 'A' && c <= 'Z') list2.add(c);
				else list3.add(c);
			}
			
			Collections.sort(list);
			Collections.sort(list2);
			Collections.sort(list3);
			
			for(char c : list) {
				sb.append(c);
			}
			
			for(char c : list2) {
				sb.append(c);
			}
			
			for(char c : list3) {
				sb.append(c);
			}
			
			sb.append("\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
