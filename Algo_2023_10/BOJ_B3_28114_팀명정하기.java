import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Person implements Comparable<Person> {
	int p;
	String name;
	
	public Person(int p, String name) {
		this.p = p;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return Integer.compare(o.p, this.p);
	}
	
}

public class BOJ_B3_28114_팀명정하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Person> list = new ArrayList<>();
		int [] arr = new int[3];
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int p = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			arr[i] = y % 100;
			list.add(new Person(p, name));
		}
		
		Arrays.sort(arr);
		Collections.sort(list);
		
		for(int n : arr) {
			System.out.print(n);
		}
		System.out.println();
		
		for(Person now : list) {
			System.out.print(now.name.charAt(0));
		}
		System.out.println();
		
	}

}
