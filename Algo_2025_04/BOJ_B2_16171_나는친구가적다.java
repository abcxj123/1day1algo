import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_16171_나는친구가적다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		s1 = s1.replaceAll("[0-9]", "");
		
		if(s1.contains(s2)) System.out.println(1);
		else System.out.println(0);
		
	}

}
