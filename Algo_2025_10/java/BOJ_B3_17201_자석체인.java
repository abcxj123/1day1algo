import java.util.Scanner;

public class BOJ_B3_17201_자석체인 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		scann.nextLine();
		char [] arr = scann.nextLine().toCharArray();
		
		boolean check = true;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				check = false;
				break;
			}
		}
		
		if(check) System.out.println("Yes");
		else System.out.println("No");

	}

}
