import java.math.BigInteger;
import java.util.Scanner;

public class BOJ_B5_15964_이상한기호 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		BigInteger A = scann.nextBigInteger();
		BigInteger B = scann.nextBigInteger();
		
		System.out.println((A.add(B)).multiply(A.subtract(B)));

	}

}
