import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_B3_25277_Culture_shock {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		scann.nextLine();
		
		String [] arr = scann.nextLine().split(" ");
		Set<String> set = new HashSet<>();
		set.add("he"); set.add("she"); set.add("him"); set.add("her");
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			if(set.contains(arr[i])) ans++;
		}
		
		System.out.println(ans);

	}

}
