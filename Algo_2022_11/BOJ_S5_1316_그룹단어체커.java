import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_S5_1316_그룹단어체커 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			ArrayList<Character> list = new ArrayList<>();
			String str = br.readLine();
			
			char past = str.charAt(0);
			list.add(past);
			boolean check = true;
			
			for (int j = 1; j < str.length(); j++) {
				char tmp = str.charAt(j);
				if(past == tmp) continue;
				else {
					if(list.contains(tmp)) {
						check = false;
						break;
					} else {
						list.add(tmp);
						past = tmp;
					}
				}
				
			}
			if(check) cnt++;
		}

		System.out.println(cnt);
	}

}
