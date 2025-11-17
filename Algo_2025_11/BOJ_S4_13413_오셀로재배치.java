import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S4_13413_오셀로재배치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());

            String s1 = br.readLine();
            String s2 = br.readLine();

            int cnt1 = 0;
            int cnt2 = 0;

            for (int i = 0; i < N; i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);

                if(c1 == 'B' && c2 == 'W') cnt1++;
                else if(c1 == 'W' && c2 == 'B') cnt2++;
            }

            int ans = 0;
            int min = Math.min(cnt1, cnt2);

            ans += min;

            if(cnt1 > cnt2) {
                ans += cnt1 - min;
            } else {
                ans += cnt2 - min;
            }

            sb.append(ans).append("\n");
        }

        System.out.println(sb.toString());

    }
}
