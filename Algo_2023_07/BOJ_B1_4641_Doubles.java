import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_B1_4641_Doubles {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int first = scann.nextInt();
			if(first == -1) break;
			
			int ans = 0;
			List<Integer> list = new ArrayList<>();
			list.add(first);
			
			while(true) {
				int n = scann.nextInt();
				if(n == 0) break;
				list.add(n);
			}
			
			Collections.sort(list);
			int N = list.size();
			
			for (int i = 0; i < N; i++) {
				int num = list.get(i);
				for (int j = i+1; j < N; j++) {
					int compare = list.get(j);
					if(num * 2 == compare) {
						ans++;
					} else if(num * 2 < compare) break;
				}
			}
			
			sb.append(ans+"\n");
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
