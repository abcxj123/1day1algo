import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_S4_11656_접미사배열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<>();
		
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			String tmp = str.substring(i, str.length());
			list.add(tmp);
		}
		
		Collections.sort(list);
		
		for (String st : list) {
			System.out.println(st);
		}
		
	}

}
