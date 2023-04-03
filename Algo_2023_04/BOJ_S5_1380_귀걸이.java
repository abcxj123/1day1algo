import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_S5_1380_귀걸이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> ans = new ArrayList<>();

		while (true) {
			int N = Integer.parseInt(br.readLine());
			
			if(N == 0) break;
			
			List<String> list = new ArrayList<>();
			
			String [] arr = new String[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = br.readLine();
			}
			
			for (int i = 0; i < 2*N-1; i++) {
				String [] str = br.readLine().split(" ");
				int idx = Integer.parseInt(str[0])-1;
				String stu = arr[idx];
				
				if(list.contains(stu)) {
					list.remove(stu);
				} else {
					list.add(stu);
				}
				
			}
			
			for(String str : list) {
				ans.add(str);
			}
			
		}
		
		int idx = 1;
		
		for (String str : ans) {
			System.out.println(idx+" "+str);
			idx++;
		}
		
	}

}
