import java.util.Scanner;

public class BOJ_B4_28290_안밖밖안계단역계단 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String s = scann.next();
		
		if(s.equals("fdsajkl;") || s.equals("jkl;fdsa")) {
			System.out.println("in-out");
		} else if(s.equals("asdf;lkj") || s.equals(";lkjasdf")) {
			System.out.println("out-in");
		} else if(s.equals("asdfjkl;")) {
			System.out.println("stairs");
		} else if(s.equals(";lkjfdsa")) {
			System.out.println("reverse");
		} else {
			System.out.println("molu");
		}

	}

}
