import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_G5_2668_숫자고르기 {
	static int N;
	static int [] arr;
	static boolean [] v;
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		N = scann.nextInt();
		arr = new int[N+1];
		v = new boolean[N+1];
		
		for (int i = 1; i <= N; i++) {
			arr[i] = scann.nextInt();
		}
		
		for (int i = 1; i <= N; i++) {
			v[i] = true;
			dfs(i, i);
			v[i] = false;
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	private static void dfs(int start, int cur) {
		if(arr[cur] == start) list.add(start);
		
			if(!v[arr[cur]]) {
				v[arr[cur]] = true;
				dfs(start, arr[cur]);
				v[arr[cur]] = false;
			
		}
		
		
	}

}
