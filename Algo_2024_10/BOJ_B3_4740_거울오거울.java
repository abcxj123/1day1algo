import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_4740_거울오거울 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals("***")) break;
			
			sb2.setLength(0);
			sb2.append(str);
			
			sb.append(sb2.reverse().toString()+"\n");
		}
		
		if(sb.length() > 0 ) sb.setLength(sb.length()-1);
		System.out.println(sb.toString());
		
	}

}
