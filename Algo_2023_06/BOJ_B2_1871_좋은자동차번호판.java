import java.util.Scanner;

public class BOJ_B2_1871_좋은자동차번호판 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scann.nextInt();
		
		for (int i = 0; i < N; i++) {
			String [] arr = scann.next().split("-");
			int front = 0;
			
			int tmp = 2;
			for (int j = 0; j < 3; j++) {
				int n = arr[0].charAt(j) - 'A';
				front += n * Math.pow(26, tmp--);
			}
			
			int back = Integer.parseInt(arr[1]);
			
			int res = Math.abs(front - back);
			
			if(res <= 100) {
				sb.append("nice\n");
			} else {
				sb.append("not nice\n");
			}
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.toString());

	}

}
