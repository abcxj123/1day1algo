import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B4_5358_FootballTeam {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		
		while((input = br.readLine()) != null) {
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				
				if(c == 'i') System.out.print('e');
				else if(c == 'e') System.out.print('i');
				else if(c == 'I') System.out.print('E');
				else if(c == 'E') System.out.print('I');
				else System.out.print(c);
			}
			
			System.out.println();
			
		}
		
	}

}
