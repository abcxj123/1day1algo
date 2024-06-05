import java.util.*;
import java.io.*;

public class BOJ_B3_5988_홀수일까짝수일까 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         

         int N = Integer.parseInt(br.readLine());

         

         for(int i=0;i<N;i++) {

             String str = br.readLine();

         char c = str.charAt(str.length()-1);

         

         if(c == '0' || c == '2' || c == '4' || c == '6' || c == '8') {

             System.out.println("even");

         } else {

             System.out.println("odd");

         }


	}

}

}
