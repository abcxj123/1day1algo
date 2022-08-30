import java.util.Scanner;

public class BOJ_S5_7567_덩치 {
	
	static class Man {
		int weight;
		int height;
		
		public Man(int weight, int hegiht) {
			this.weight = weight;
			this.height = hegiht;
		}	
		
	}

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		Man [] arr = new Man[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = new Man(scann.nextInt(), scann.nextInt());
		}
		
		for (int i = 0; i < N; i++) {
			int rank = 1;
			Man cur = arr[i];
			for (int j = 0; j < N; j++) {
				if(i == j) continue;
				
				Man man = arr[j];
				if(cur.weight < man.weight && cur.height < man.height) {
					rank++;
				}
			}
			sb.append(rank).append(" ");
		}
		
		System.out.println(sb.toString());

	}

}
