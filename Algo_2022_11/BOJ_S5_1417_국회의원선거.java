import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ_S5_1417_국회의원선거 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int N = scann.nextInt();
        
        if(N == 1) {
        	System.out.println(0);
        	System.exit(0);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int dasom = scann.nextInt();
        
        for (int i = 2; i <= N; i++) {
            int n = scann.nextInt();
            pq.add(n);
        }

        int cnt = 0;

        while (true) {
            int cur = pq.poll();
            if(dasom > cur) break;
            cur--;
            pq.add(cur);
            dasom++;
            cnt++;
        }

        System.out.println(cnt);

    }

}
