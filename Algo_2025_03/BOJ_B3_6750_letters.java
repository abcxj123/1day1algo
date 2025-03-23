import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_B3_6750_letters {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		Set<Character> set = new HashSet<>();
		set.add('I'); set.add('O'); set.add('S'); set.add('H');
		set.add('Z'); set.add('X'); set.add('N');
		
		String str = scann.nextLine();
		boolean check = true;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(!set.contains(c)) {
				check = false;
				break;
			}
		}
		
		if(check) System.out.println("YES");
		else System.out.println("NO");

	}

}
