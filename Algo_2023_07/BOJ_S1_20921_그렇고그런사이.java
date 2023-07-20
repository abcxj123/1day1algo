import java.util.Scanner;

public class BOJ_S1_20921_그렇고그런사이 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		int K = scann.nextInt();
		int origin = N;
		
		boolean [] used = new boolean[N+1];
		
		while(K > 0) {
			boolean check = false;
			int tmp = K+1;
			if(K >= N-1) {
				sb.append(N+" ");
				used[N] = true;
				K -= (N-1);
				N--;
			} else {
				while(true) {
					if(used[tmp]) {
						tmp--;
					} else {
						break;
					}
					
					if(tmp == 0) {
						check = true;
						break;
					}
				}
				sb.append(tmp+" ");
				used[tmp] = true;
				K -= tmp;
			}
			if(check) {
				System.out.println("답이 없음");
				break;
			}
		}
		
		for (int i = 1; i <= origin; i++) {
			if(!used[i]) sb.append(i+" ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		

	}

}
