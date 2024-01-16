import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_G3_1111_IQTest {
	static class Pair {
		int a;
		int b;
		
		public Pair(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	static List<Pair> list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int N = Integer.parseInt(br.readLine());
		
		if(N == 1) {
			System.out.println("A");
			System.exit(0);
		}
		
		list = new ArrayList<>();
		int [] nums = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int n1 = nums[0];
		boolean check = true;
		
		for (int i = 1; i < N; i++) {
			if(nums[i] != n1) {
				check = false;
				break;
			}
		}
		
		if(check) {
			System.out.println(n1);
			System.exit(0);
		}
		
		int n2 = nums[1];
		findPair(n1, n2);
		n1 = n2;
		
		for (int i = 2; i < N; i++) {
			n2 = nums[i];
			
			int size = list.size();
			for (int j = 0; j < size; j++) {
				Pair pair = list.get(j);
				if(n1*pair.a+pair.b != n2) {
					list.remove(j--);
					size--;
				}
			}
			
			n1 = n2;
		}
		
		if(list.size() > 1) {
			System.out.println("A");
		} else if(list.size() == 0) {
			System.out.println("B");
		} else if(list.size() == 1) {
			Pair pair = list.get(0);
			System.out.println(n2*pair.a+pair.b);
		}
			
	}

	private static void findPair(int n1, int n2) {
		for (int i = -200; i <= 200; i++) {
			for (int j = -20000; j <= 20000; j++) {
				if(n1*i+j == n2) {
					list.add(new Pair(i, j));
				}
			}
		}
		
	}

}
