import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Nation implements Comparable<Nation> {
	int idx;
	int gold;
	int silver;
	int bronze;
	
	public Nation(int idx, int gold, int silver, int bronze) {
		this.idx = idx;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}

	@Override
	public int compareTo(Nation o) {
		if(this.gold != o.gold) {
			return o.gold - this.gold;
		} else if(this.silver != o.silver) {
			return o.silver - this.silver;
		} else {
			return o.bronze - this.bronze;
		}
	}
	
}

public class BOJ_S5_8979_올림픽 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Nation [] arr = new Nation[N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int idx = Integer.parseInt(st.nextToken());
			int gold = Integer.parseInt(st.nextToken());
			int silver = Integer.parseInt(st.nextToken());
			int bronze = Integer.parseInt(st.nextToken());
			arr[i] = new Nation(idx, gold, silver, bronze);
		}
		
		Arrays.sort(arr);
		
		int tmp = -1;
		int pastG = -1;
		int pastS = -1;
		int pastB = -1;
		
		for (int i = 0; i < N; i++) {
			Nation now = arr[i];
			
			if(now.gold != pastG || now.silver != pastS || now.bronze != pastB) {
				tmp = i;
				pastG = now.gold;
				pastS = now.silver;
				pastB = now.bronze;
			} 
			
			if(now.idx == K) {
				System.out.println(tmp+1);
				break;
			}
			
		}
	}

}
