import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_S4_4949_균형잡힌세상 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			if(str.equals(".")) {
				break;
			}
			Stack<Character> stack = new Stack<>();
			boolean flag = false;
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if(c == '(' || c == '[') {
					stack.push(c);
				} else if(c == ')') {
					if(stack.isEmpty()) {
						flag = true;
						break;
					} else {
						char item = stack.pop();
						if(item != '(') {
							flag = true;
							break;
						}
					}
					
				} else if(c == ']') {
					if(stack.isEmpty()) {
						flag = true;
						break;
					} else {
						char item = stack.pop();
						if(item != '[') {
							flag = true;
							break;
						}
					}
					
				}
			}
			if(flag || !stack.isEmpty()) System.out.println("no");
			else System.out.println("yes");
		}

	}

}
