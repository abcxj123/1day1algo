import java.util.Scanner;

public class BOJ_S5_2669_직사각형네개의합집합의면적구하기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int [][] map = new int[100][100];
		int xMax = -1;
		int yMax = -1;
		
		for (int i = 0; i < 4; i++) {
			int x1 = scann.nextInt()-1;
			int y1 = scann.nextInt()-1;
			int x2 = scann.nextInt()-1;
			int y2 = scann.nextInt()-1;
			
			xMax = Math.max(xMax, x2);
			yMax = Math.max(yMax, y2);
			
			for (int j = y1; j < y2; j++) {
				for (int k = x1; k < x2; k++) {
					map[k][j] = 1;
				}
			}
		}
		
		int ans = 0;
		
		for (int i = 0; i <= yMax; i++) {
			for (int j = 0; j < xMax; j++) {
				ans += map[j][i];
			}
		}
		
		System.out.println(ans);

	}

}
