import java.util.Scanner;

public class BOJ_B1_27961_고양이는많을수록좋다 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        long N = scann.nextLong();

        if(N == 0) {
            System.out.println(0);
            return;
        }

        int ans = 1;
        long num = 1;

        while(num < N) {
            num *= 2;
            ans++;
        }

        System.out.println(ans);

    }
}
