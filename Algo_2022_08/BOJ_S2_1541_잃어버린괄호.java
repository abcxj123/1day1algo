import java.util.Scanner;

public class BOJ_S2_1541_잃어버린괄호 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		int sum = 0;
		
		String str = scann.next();
		
		String [] nums = str.split("-");
		
		String [] tmp = nums[0].split("\\+");
		
		for (String st : tmp) {
			sum += Integer.parseInt(st);
		}
		
		for (int i = 1; i < nums.length; i++) {
			String [] nums2 = nums[i].split("\\+");
			for (int j = 0; j < nums2.length; j++) {
				sum -= Integer.parseInt(nums2[j]);
			}
		}
		
		System.out.println(sum);
		
	}

}
