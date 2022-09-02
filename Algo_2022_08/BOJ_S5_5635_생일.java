import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_S5_5635_생일 {
	
	static class Man implements Comparable<Man> {
		String name;
		int day;
		int month;
		int year;
		
		public Man(String name, int day, int month, int year) {
			this.name = name;
			this.day = day;
			this.month = month;
			this.year = year;
		}

		@Override
		public int compareTo(Man o) {
			if(this.year == o.year) {
				if(this.month == o.month) {
					return Integer.compare(this.day, o.day);
				} else {
					return Integer.compare(this.month, o.month);
				}
			} else {
				return Integer.compare(this.year, o.year);
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Man [] arr = new Man[n];
		
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			String [] str = tmp.split(" ");
			arr[i] = new Man(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]), Integer.parseInt(str[3]));
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[n-1].name);
		System.out.println(arr[0].name);

	}

}
