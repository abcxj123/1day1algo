import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B3_25703_포인터공부 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        sb.append("int a;\n");
        sb.append("int *ptr = &a;\n");

        for (int i = 2; i <= num; i++) {
            sb.append("int ");

            for (int j = 0; j < i; j++) {
                sb.append('*');
            }
            sb.append("ptr").append(i).append(" = &ptr").append(i-1 == 1 ? "" : i-1).append(";\n");
        }

        System.out.println(sb.toString());

	}

}
