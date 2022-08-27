import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_S5_1181_단어정렬 {
	
	static class Word implements Comparable<Word> {
		String str;

		public Word(String str) {
			this.str = str;
		}

		@Override
		public int compareTo(Word o) {
			int l1 = this.str.length();
			int l2 = o.str.length();
			
			if(l1 != l2) {
				return l1 - l2;
			} else {
				for (int i = 0; i < l1; i++) {
					char n = this.str.charAt(i);
					char m = o.str.charAt(i);
					if((int)n == (int)m) continue;
					if((int)n < (int)m) {
						return -1;
					} else {
						return 1;
					}
				}
				
				return 0;
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Word [] arr = new Word[N];
		
		for (int i = 0; i < N; i++) {
			String tmp = br.readLine();
			arr[i] = new Word(tmp);
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(arr[0].str).append('\n');
		
		for (int i = 1; i < N; i++) {
			if(!arr[i].str.equals(arr[i-1].str)) {
				sb.append(arr[i].str).append('\n');
			}
		}
		
		System.out.print(sb.toString());
		
	}

}
