import java.util.Scanner;

public class BOJ_B1_2684_동전게임 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		
		int N = scann.nextInt();
		
		for (int t = 0; t < N; t++) {
			StringBuilder sb = new StringBuilder();
			int [] arr = new int[8];
			
			int pp = 0;
			int p = 0;
			int n = 0;
			
			String str = scann.next();
			
			for (int i = 0; i < 40; i++) {
				if(str.charAt(i) == 'H') n = 1;
				else n = -1;
				
				if(n == 1) {
					if(p == 1) {
						// 앞앞앞
						if(pp == 1) {
							arr[7]++;
						// 뒤앞앞
						} else if(pp == -1) {
							arr[3]++;
						}
					} else if(p == -1) {
						// 앞뒤앞
						if(pp == 1) {
							arr[5]++;
						// 뒤뒤앞
						} else if(pp == -1) {
							arr[1]++;
						}
					} 
				} else if(n == -1) {
					if(p == 1) {
						// 앞앞뒤
						if(pp == 1) {
							arr[6]++;
						// 뒤앞뒤
						} else if(pp == -1) {
							arr[2]++;
						}
					} else if(p == -1) {
						// 앞뒤뒤
						if(pp == 1) {
							arr[4]++;
						// 뒤뒤뒤
						} else if(pp == -1) {
							arr[0]++;
						}
					} 
				}
				
				pp = p;
				p = n;
			}
			
			for (int i = 0; i < 8; i++) {
				sb.append(arr[i]+" ");
			}
			
			sb.setLength(sb.length()-1);
			System.out.println(sb.toString());
			
		}

	}

}
