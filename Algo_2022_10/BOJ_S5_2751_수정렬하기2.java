import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class BOJ_S5_2751_수정렬하기2 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			set.add(scann.nextInt());
		}
		
		List<Integer> list = new ArrayList<Integer>(set);

		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}

}
