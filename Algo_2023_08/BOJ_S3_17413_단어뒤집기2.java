import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_S3_17413_단어뒤집기2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		boolean check = false;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '<') {
				while(!stack.isEmpty()) {
					char cc = stack.pop();
					sb.append(cc);
				}
				sb.append(c);
				check = true;
			} else if(c == '>') {
				sb.append(c);
				check = false;
			} else if(c == ' ' && !check) {
				while(!stack.isEmpty()) {
					char cc = stack.pop();
					sb.append(cc);
				}
				sb.append(c);
			} else {
				if(!check) {
					stack.push(c);
				} else {
					sb.append(c);
				}
			}
		}
		
		if(!stack.isEmpty()) {
			while(!stack.isEmpty()) {
				char cc = stack.pop();
				sb.append(cc);
			}
		}
		
		System.out.println(sb.toString());

	}

}
