import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_B3_32342_와우와쿼리 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int count = 0;
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if (j+2 >= str.length()){
                    break;
                }else{
                    String wow = str.substring(j, j+3);

                    if (wow.equals("WOW")){
                        count++;
                    }
                }
            }

            sb.append(count).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}
