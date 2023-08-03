import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_S4_1544_사이클단어 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			boolean check = false;
			
			for (int j = 0; j < list.size(); j++) {
				String compare = list.get(j);
				if(compare.indexOf(str) != -1 && str.length()*2 == compare.length()) {
					check = true;
					break;
				}
			}
			
			if(!check) {
				list.add(str+str);
			}
			
		}
		
		System.out.println(list.size());
		
		
		
		
	}

}
