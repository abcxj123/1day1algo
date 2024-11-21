import java.util.Scanner;

public class BOJ_B3_21955_Split {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		String origin = scann.nextLine();
		String str1 = origin.substring(0, origin.length()/2);
		String str2 = origin.substring(origin.length()/2);
		
		System.out.println(str1+" "+str2);
	}

}
