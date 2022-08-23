import java.util.Scanner;
import java.util.Stack;

public class BOJ_S4_10773_제로 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int N = scann.nextInt();
        int ans = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int n = scann.nextInt();
            if(n == 0) {
                stack.pop();
            } else {
                stack.add(n);
            }

        }

        while(!stack.isEmpty()) {
            int n = stack.pop();
            ans += n;
        }

        System.out.println(ans);
    }

}
