import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_B1_1296_팀이름정하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int OL = 0;
		int OO = 0;
		int OV = 0;
		int OE = 0;
		
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'L') OL++;
			else if(c == 'O') OO++;
			else if(c == 'V') OV++;
			else if(c == 'E') OE++;
		}
		
		int N = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		int max = -1;
		
		for (int i = 0; i < N; i++) {
			int L = OL;
			int O = OO;
			int V = OV;
			int E = OE;
			
			String newStr = br.readLine();
			
			for (int j = 0; j < newStr.length(); j++) {
				char c = newStr.charAt(j);
				if(c == 'L') L++;
				else if(c == 'O') O++;
				else if(c == 'V') V++;
				else if(c == 'E') E++;
			}
			
			int num = ((L+O) * (L+V) * (L+E) * (O+V) * (O+E) * (V+E)) % 100;
			
			if(num > max) {
				list.clear();
				list.add(newStr);
				max = num;
			} else if(num == max) {
				list.add(newStr);
			}
			
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));
		
	}

}
