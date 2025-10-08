import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_B2_2966_찍기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		scann.nextLine();
		
		String s = scann.nextLine();
		
		String aa = "ABC".repeat(34);
		String bb = "BABC".repeat(25);
		String gg = "CCAABB".repeat(17);
		
		int A = 0;
		int B = 0;
		int G = 0;
		
		for (int i = 0; i < N; i++) {
			char c = s.charAt(i);
			
			if(aa.charAt(i) == c) A++;
			if(bb.charAt(i) == c) B++;
			if(gg.charAt(i) == c) G++;
		}
		
		List<String> list = new ArrayList<>();
		list.add("Adrian");
		
		int max = A;
		
		if(max < B) {
			list.clear();
			list.add("Bruno");
			max = B;
		} else if(max == B) {
			list.add("Bruno");
		}
		
		if(max < G) {
			list.clear();
			list.add("Goran");
			max = G;
		} else if(max == G) {
			list.add("Goran");
		}
		
		System.out.println(max);
		
		for (String name : list) {
			System.out.println(name);
		}

	}

}
