import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B1_2897_몬스터트럭 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		char [][] map = new char[R][C];
		
		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++) {
				map[i][j] = str.charAt(j);
			}
		}
		
		int [] ans = new int[5];
		
		for (int i = 0; i < R-1; i++) {
			outer:
				for (int j = 0; j < C-1; j++) {
					char [] arr = new char[4];
					arr[0] = map[i][j];
					arr[1] = map[i][j+1];
					arr[2] = map[i+1][j];
					arr[3] = map[i+1][j+1];
					
					int car = 0;
					for (int k = 0; k < 4; k++) {
						if(arr[k] == '#') continue outer;
						else if(arr[k] == 'X') car++;
					}
					
					ans[car]++;
					
				}
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(ans[i]);
		}
		
	}

}
