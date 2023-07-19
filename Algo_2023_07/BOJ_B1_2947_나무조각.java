import java.util.Scanner;

public class BOJ_B1_2947_나무조각 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int [] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = scann.nextInt();
		}
		
		while(arr[0] != 1 || arr[1] != 2 || arr[2] != 3 || arr[3] != 4 || arr[4] != 5) {
			if(arr[0] > arr[1]) {
				int tmp = arr[0];
				arr[0] = arr[1];
				arr[1] = tmp;
				sb.append(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+"\n");
			}
			
			if(arr[1] > arr[2]) {
				int tmp = arr[1];
				arr[1] = arr[2];
				arr[2] = tmp;
				sb.append(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+"\n");
			}
			
			if(arr[2] > arr[3]) {
				int tmp = arr[2];
				arr[2] = arr[3];
				arr[3] = tmp;
				sb.append(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+"\n");
			}
			
			if(arr[3] > arr[4]) {
				int tmp = arr[3];
				arr[3] = arr[4];
				arr[4] = tmp;
				sb.append(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+"\n");
			}
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
