import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S4_1487_물건팔기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int price = Integer.parseInt(st.nextToken());
			int delivery = Integer.parseInt(st.nextToken());
			
			arr[i][0] = price;
			arr[i][1] = delivery;
			
		}
		
		int max = 0;
		int maxPrice = 0;
		
		for (int i = 0; i < N; i++) {
			int sejun = arr[i][0];
			int sum = 0;
			for (int j = 0; j < N; j++) {
				int price = arr[j][0];
				
				if(sejun > price) continue;
				
				int delivery = arr[j][1];
				sum += Math.max(0, sejun-delivery);
				
			}
			
			if(sum > max) {
				maxPrice = sejun;
				max = sum;
			} else if(sum == max) {
				if(maxPrice > sejun) {
					maxPrice = sejun;
				}
			}
		}
		
		System.out.println(maxPrice);
		
	}

}
