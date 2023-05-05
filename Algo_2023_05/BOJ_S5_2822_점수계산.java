import java.util.Arrays;
import java.util.Scanner;

class Question implements Comparable<Question> {
	int idx;
	int score;
	
	public Question(int idx, int score) {
		this.idx = idx;
		this.score = score;
	}

	public int compareTo(Question o) {
		return o.score - this.score;
	}
	
}

public class BOJ_S5_2822_점수계산 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		Question [] arr = new Question[8];
		int [] ans = new int[5];
		
		for (int i = 0; i < 8; i++) {
			int score = scann.nextInt();
			arr[i] = new Question(i+1, score);
		}
		
		Arrays.sort(arr);
		int tot = 0;
		
		for (int i = 0; i < 5; i++) {
			Question tmp = arr[i];
			tot += tmp.score;
			ans[i] = tmp.idx;
		}
		
		Arrays.sort(ans);
		
		System.out.println(tot);
		for (int i = 0; i < 5; i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
