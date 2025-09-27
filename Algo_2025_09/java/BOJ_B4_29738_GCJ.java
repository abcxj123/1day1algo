import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_29738_GCJ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= N; i++) {
            int score = Integer.parseInt(br.readLine());
            
            if(score <= 25) {
            	System.out.println("Case #"+i+": World Finals");
            } else if(score <= 1000) {
                System.out.println("Case #"+i+": Round 3");
            } else if(score <= 4500) {
            	System.out.println("Case #"+i+": Round 2");
            } else {
            	System.out.println("Case #"+i+": Round 1");
            }
        }

	}

}
