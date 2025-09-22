import java.util.Scanner;

public class BOJ_B2_13420_사칙연산 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
        
        int T = scann.nextInt();
        scann.nextLine();
        
        for (int i = 0; i < T; i++) {
            String [] input = scann.nextLine().split(" ");
            
            long a = Long.parseLong(input[0]);
            char op = input[1].charAt(0);
            long b = Long.parseLong(input[2]);
            long ans = Long.parseLong(input[4]);
            
            switch (op) {
                case '+':
                    a += b;
                    break;
                case '-':
                    a -= b;
                    break;
                case '*':
                    a *= b;
                    break;
                case '/':
                    a /= b;
                    break;
                default:
                    break;
            }
            
            if (a == ans) {
                System.out.println("correct");
            } else {
                System.out.println("wrong answer");
            }
            
        }
    }



}
