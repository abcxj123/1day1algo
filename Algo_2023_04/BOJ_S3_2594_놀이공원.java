import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Time implements Comparable<Time> {
	int start;
	int end;
	
	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public int compareTo(Time o) {
		return Integer.compare(this.start, o.start);
	}
	
}

public class BOJ_S3_2594_놀이공원 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Time> list = new ArrayList<>();

		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			list.add(new Time(start, end));
		}
		
		Collections.sort(list);
		
		Time first = list.get(0);
		int fs = toTime(first.start)-10;
		int max = fs - 600;
		int last = toTime(first.end)+10;
		
		list.remove(0);
		
		for(Time t : list) {
			
			if(last < toTime(t.start)-10) {
				max = Math.max(max, toTime(t.start)-10 - last);
			}
			
			last = Math.max(last, toTime(t.end)+10);
		}
		
		max = Math.max(max, 22*60 - last);
		
		System.out.println(max);
		
	}

	private static int toTime(int t) {
		return (t / 100) * 60 + (t % 100);
	}

}
