import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_B3_20540_연길이의이상형 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		Map<Character, Character> map = new HashMap<>();
		
		map.put('I', 'E');
		map.put('E', 'I');
		map.put('S', 'N');
		map.put('N', 'S');
		map.put('T', 'F');
		map.put('F', 'T');
		map.put('J', 'P');
		map.put('P', 'J');
		
		String mbti = scann.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < mbti.length(); i++) {
			char c = mbti.charAt(i);
			
			sb.append(map.get(c));
		}
		
		System.out.println(sb.toString());

	}

}
