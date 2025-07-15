import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_B4_32710_구구단표 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		Set<Integer> set = new HashSet<>();
		
		for (int i = 1; i <= 9; i++) {
			set.add(i);
			for (int j = 2; j <= 9; j++) {
				set.add(i*j);
			}
		}
		
		if(set.contains(N)) System.out.println(1);
		else System.out.println(0);

	}

}
