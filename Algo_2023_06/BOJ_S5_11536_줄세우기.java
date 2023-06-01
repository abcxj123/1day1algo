import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_11536_줄세우기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String first = br.readLine();
		String second = br.readLine();
		boolean neither = false;
		boolean decrease;
		
		if(first.compareTo(second) < 0) {
			decrease = false;
		} else {
			decrease = true;
		}
		
		String past = second;
		
		for (int i = 0; i < N-2; i++) {
			String str = br.readLine();
			int res = past.compareTo(str);
			if(res < 0 && decrease) {
				neither = true;
				break;
			} else if(res > 0 && !decrease) {
				neither = true;
				break;
			}
		}
		
		if(neither) {
			System.out.println("NEITHER");
		} else if(decrease) {
			System.out.println("DECREASING");
		} else {
			System.out.println("INCREASING");
		}
		
	}

}
