import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_S4_1026_보물 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int N = scann.nextInt();
        int ans = 0;

        int [] arr1 = new int[N];
        Integer [] arr2 = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr1[i] = scann.nextInt();
        }

        for (int i = 0; i < N; i++) {
            arr2[i] = scann.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());
        
        for (int i = 0; i < N; i++) {
			ans += arr1[i] * arr2[i];
		}
        
        System.out.println(ans);

    }

}
