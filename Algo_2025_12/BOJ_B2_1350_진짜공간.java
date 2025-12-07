import java.util.Scanner;

public class BOJ_B2_1350_진짜공간 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        
        int N = scann.nextInt();
        int [] arr = new int[N];
        
        long ans = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scann.nextInt();
        }

        double disc = scann.nextInt();
        
        for (int j = 0; j < N; j++) {
            if (arr[j] >= 0) {
                double cnt = Math.ceil(1.0 * arr[j] / disc);
                ans += (int)cnt * disc;
            }
        }

        System.out.println(ans);

    }
}
