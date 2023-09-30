import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_15784_질투진서 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken())-1;
		int b = Integer.parseInt(st.nextToken())-1;
		int [][] arr = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int Jinseo = arr[a][b];
		
		for (int i = 0; i < N; i++) {
			if(i == a) continue;
			if(arr[i][b] > Jinseo) {
				System.out.println("ANGRY");
				System.exit(0);
			}
		}	
		
		for (int i = 0; i < N; i++) {
			if(i == b) continue;
			if(arr[a][i] > Jinseo) {
				System.out.println("ANGRY");
				System.exit(0);
			}
		}
		
		System.out.println("HAPPY");
		
	}

}
