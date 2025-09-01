import java.util.Scanner;

public class BOJ_B5_33612_피갤컵 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int total = 2024*12 + 8;
		int N = scann.nextInt()-1;
		
		total += 7*N;
		
		int year = total / 12;
		int month = total % 12;
		
		if(month == 0) {
			year--;
			month = 12;
		}
		
		System.out.println(year+" "+month);

	}

}
