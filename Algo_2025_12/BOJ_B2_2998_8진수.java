import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ_B2_2998_8진수 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        BigInteger num = new BigInteger(str, 2);

        String ans = num.toString(8);

        System.out.println(ans);
    }
}
