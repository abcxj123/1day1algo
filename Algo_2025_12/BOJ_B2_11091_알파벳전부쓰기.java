import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B2_11091_알파벳전부쓰기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringBuilder sb = new StringBuilder();

            String s = br.readLine().toLowerCase();
            int [] cnt = new int[26];

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if(c < 'a' || c > 'z') continue;

                cnt[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                if(cnt[i] == 0) sb.append((char)('a'+i));
            }

            if(sb.length() == 0) ans.append("pangram").append("\n");
            else ans.append("missing ").append(sb.toString()).append("\n");
        }

        System.out.println(ans.toString());

    }
}
