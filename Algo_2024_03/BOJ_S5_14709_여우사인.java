import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S5_14709_여우사인 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int N = Integer.parseInt(br.readLine());
		
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		
		for (int i = 0; i <= 5; i++) {
			list.add(new HashSet<Integer>());
		}
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			list.get(n1).add(n2);
			list.get(n2).add(n1);
		}
		
		boolean ans = false;
		outer:
			{
			if(!list.get(1).contains(3) || !list.get(1).contains(4)) break outer;
			if(!list.get(3).contains(1) || !list.get(3).contains(4)) break outer;
			if(!list.get(4).contains(1) || !list.get(4).contains(3)) break outer;
			if(list.get(2).size() > 0 || list.get(5).size() > 0) break outer;
			ans = true;
			}
		
		if(ans) {
			System.out.println("Wa-pa-pa-pa-pa-pa-pow!");
		} else {
			System.out.println("Woof-meow-tweet-squeek");
		}
		
	}

}
