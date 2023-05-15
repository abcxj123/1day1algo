import java.util.Scanner;

public class BOJ_S3_N과M2 {

	static int N, R;
	static int [] arr, pick;
	static boolean [] v;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		N = scann.nextInt();
		R = scann.nextInt();
		
		arr = new int[N];
		pick = new int[R];
		v = new boolean[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
		perm(0);
		sb.setLength(sb.length()-1);
		
		System.out.println(sb.toString());

	}

	private static void perm(int cnt) {
		if(cnt == R) {
			StringBuilder tmp = new StringBuilder();
			int past = 0;
			boolean check = false;
			for (int i = 0; i < R; i++) {
				int now = pick[i];
				
				if(past > now) {
					check = true;
					break;
				}
				
				tmp.append(now+" ");
				
				past = now;
				
			}
			
			if(!check) {
				tmp.setLength(tmp.length()-1);
				tmp.append("\n");
				sb.append(tmp.toString());
			}
			
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(!v[i]) {
				v[i] = true;
				pick[cnt] = arr[i];
				perm(cnt+1);
				v[i] = false;
			}
		}
		
	}

}
