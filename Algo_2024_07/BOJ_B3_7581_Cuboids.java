import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_B3_7581_Cuboids {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0) break;
			
			if(a == 0) a = d / (b * c);
			if(b == 0) b = d / (a * c);
			if(c == 0) c = d / (a * b);
			if(d == 0) d = a * b * c;
			
			sb.append(a+" "+b+" "+c+" "+d+"\n");
			
		}
		
		if(sb.length() > 0) {
			sb.setLength(sb.length()-1);
		}
		System.out.println(sb.toString());
		
	}

}
