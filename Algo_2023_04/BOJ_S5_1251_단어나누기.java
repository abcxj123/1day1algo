import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_S5_1251_단어나누기 {
	
	static List<String> list = new ArrayList<>();
	static String str;
	static int leng;
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		str = scann.next();
		leng = str.length();
		
		for (int i = 1; i < leng-1; i++) {
			for (int j = i+1; j < leng; j++) {
				makeString(i, j);
			}
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(0));

	}

	private static void makeString(int a, int b) {
		StringBuilder sb = new StringBuilder();
		
		StringBuilder s1 = new StringBuilder(str.substring(0, a));
		StringBuilder s2 = new StringBuilder(str.substring(a, b));
		StringBuilder s3 = new StringBuilder(str.substring(b));
		
		sb.append(s1.reverse().toString()).append(s2.reverse().toString()).append(s3.reverse()).toString();
		
		list.add(sb.toString());
		
	}

}
