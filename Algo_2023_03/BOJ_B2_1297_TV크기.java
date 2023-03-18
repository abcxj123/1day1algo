import java.util.Scanner;

public class BOJ_B2_1297_TV크기 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		double D = scann.nextDouble();
		int H = scann.nextInt();
		int W = scann.nextInt();
		int tmp = H*H + W*W;
		D *= D;
		
		double ratio = Math.sqrt(D / tmp);
		
		int rH = (int) (H * ratio);
		int rW = (int) (W * ratio);
		System.out.println(rH+" "+rW);

	}

}
