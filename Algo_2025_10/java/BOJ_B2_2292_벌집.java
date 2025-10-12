import java.util.Scanner;

public class BOJ_B2_2292_벌집 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
	    int cnt = 1;
	    int range = 2;

	    if (N == 1) {
	        System.out.println(1);
	        return;
	    }
	       
	    while (range <= N) {
            range += 6*cnt;
            cnt++;
        }
           
        System.out.println(cnt);

	}

}
