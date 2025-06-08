import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_2754_학점계산 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		String str = br.readLine();
        double grade = 0;
        char c = str.charAt(0);
        
        if (c == 'A') {
            grade = 4;
        } else if (c == 'B') {
            grade = 3;
        } else if (c == 'C') {
            grade = 2;
        } else if (c == 'D') {
            grade = 1;
        } else {
            System.out.print("0.0");
            System.exit(0);
        }
        
        c = str.charAt(1);
        if (c == '+') {
            grade += 0.3;
        } else if (c == '-') {
            grade -= 0.3;
        }
        
        System.out.print(grade);

	}

}
