import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Person implements Comparable<Person> {
	int age;
	String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.age, o.age);
	}
	
}

public class BOJ_S5_10814_나이순정렬 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Person [] arr = new Person[N];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			arr[i] = new Person(age, name);
		}
		
		Arrays.sort(arr);
		
		for (int i = 0; i < N; i++) {
			Person cur = arr[i];
			System.out.println(cur.age+" "+cur.name);
		}

	}

}
