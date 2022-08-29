import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S4_2578_빙고 {
	
	static class Node {
		int r;
		int c;
		
		public Node(int r, int c) {
			this.r = r;
			this.c = c;
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int turn = 0;
		int line = 0;
		
		Node [] arr = new Node[26];
		boolean [][] bingo = new boolean[6][6];
		
		for (int i = 1; i <= 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 5; j++) {
				int n = Integer.parseInt(st.nextToken());
				arr[n] = new Node(i, j);
			}
		}
		
		for (int i = 1; i <= 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 5; j++) {
				turn++;
				line = 0;
				
				int m = Integer.parseInt(st.nextToken());
				int r = arr[m].r;
				int c = arr[m].c;
				bingo[r][c] = true;
				
				for (int k = 1; k <= 5; k++) {
					if(bingo[k][1] && bingo[k][2] && bingo[k][3] && bingo[k][4] && bingo[k][5]) {
						line++;
						if(line == 3) {
							System.out.println(turn);
							return ;
						}
					}
				}
				
				for (int k = 1; k <= 5; k++) {
					if(bingo[1][k] && bingo[2][k] && bingo[3][k] && bingo[4][k] && bingo[5][k]) {
						line++;
						if(line == 3) {
							System.out.println(turn);
							return ;
						}
					}
				}
				
				if(bingo[1][1] && bingo[2][2] && bingo[3][3] && bingo[4][4] && bingo[5][5]) {
					line++;
					if(line == 3) {
						System.out.println(turn);
						return ;
					}
				}
				
				if(bingo[1][5] && bingo[2][4] && bingo[3][3] && bingo[4][2] && bingo[5][1]) {
					line++;
					if(line == 3) {
						System.out.println(turn);
						return ;
					}
				}
				
			}
		}

	}

}
