import java.util.Scanner;

public class BOJ_B5_15727_조별과제를하려는데조장이사라졌다 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int L = scann.nextInt();
		
		if(L % 5 == 0) {
			System.out.println(L/5);
		} else {
			System.out.println(L/5+1);
		}

	}

}
