import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S4_2980_도로와신호등 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int [][] traffic = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			
			traffic[i][0] = Integer.parseInt(st.nextToken());
			traffic[i][1] = Integer.parseInt(st.nextToken());
			traffic[i][2] = Integer.parseInt(st.nextToken());
		}
		
		int time = 0;
		int dist = 0;
		
		time += (traffic[0][0] - 1);
		
		for (int i = 0; i < N; i++) {
			time += (traffic[i][0] - dist);
			dist = traffic[i][0];
			
			int red = traffic[i][1];
			int green = traffic[i][2];
			int cycle = red + green;
			
			if(time % cycle < red) {
				time += red - (time % cycle);
			}
		}
		
		time += (L - dist);
		
		System.out.println(time);
		
	}

}
