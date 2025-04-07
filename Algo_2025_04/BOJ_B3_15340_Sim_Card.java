import java.util.Scanner;

public class BOJ_B3_15340_Sim_Card {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		while(true) {
			int a = scann.nextInt();
			int b = scann.nextInt();
			
			if(a == 0 && b == 0) break;
			
			int n1 = a*30 + b*40;
			int n2 = a*35 + b*30;
			int n3 = a*40 + b*20;
			
			System.out.println(Math.min(n1, Math.min(n2, n3)));
			
		}

	}

}
