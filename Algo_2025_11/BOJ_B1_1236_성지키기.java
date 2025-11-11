import java.util.Scanner;

public class BOJ_B1_1236_성지키기 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        
        int N = scann.nextInt();
        int M = scann.nextInt();

        char[][] map = new char[N][M];

        for (int i = 0; i < N; i++) {
            map[i] = scann.next().toCharArray();
        }

        int rowCnt = 0;
        outer:
        	for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 'X') {
                    	rowCnt++;
                        continue outer;
                    }
                }
                
            }

        int colCnt = 0;
        outer:
        	for (int j = 0; j < M; j++) {
                for (int i = 0; i < N; i++) {
                    if (map[i][j] == 'X') {
                        colCnt++;
                        continue outer;
                    }
                }
            }

        System.out.println(Math.max(N-rowCnt, M-colCnt));
        
    }
}
