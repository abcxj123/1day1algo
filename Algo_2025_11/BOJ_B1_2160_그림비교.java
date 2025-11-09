import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_B1_2160_그림비교 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<boolean[][]> pics = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			pics.add(new boolean[5][7]);
			for(int j = 0; j < 5; j++) {
				char[] input = br.readLine().toCharArray();
				 for(int k = 0; k < 7; k++) {
					 if (input[k]=='.') pics.get(i)[j][k] = false;
					 else pics.get(i)[j][k] = true;
				 }
			}
		}
		
		int a = -1;
		int b = -1;
		int min = 40;

		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				int temp = 0;
				
				for(int x = 0; x < 5; x++) {
					for(int y = 0; y < 7; y++) {						
						if(pics.get(i)[x][y] != pics.get(j)[x][y]) temp++;
					}
					
					if(temp > min) break;
				}
				
				if(min > temp) {
					a = i;
					b = j;
					min = temp;
				}
			}
		}
		
		System.out.print((a+1)+" "+(b+1));
	}

}
