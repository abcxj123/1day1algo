import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_S5_8892_팰린드롬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            String [] arr = new String[N];

            for (int i = 0; i < N; i++) {
                arr[i] = br.readLine();
            }

            boolean check = false;

            outer2:
            for (int i = 0; i < N; i++) {
                outer:
                for (int j = 0; j < N; j++) {
                    if(i == j) continue;

                    String s2 = arr[i] + arr[j];

                    for (int k = 0; k < s2.length()/2; k++) {
                        char c1 = s2.charAt(k);
                        char c2 = s2.charAt(s2.length()-1-k);

                        if(c1 != c2) continue outer;
                    }

                    sb.append(s2).append("\n");
                    check = true;
                    break outer2;
                }
            }

            if(!check) sb.append("0\n");

        }

        System.out.println(sb.toString());

    }

}
