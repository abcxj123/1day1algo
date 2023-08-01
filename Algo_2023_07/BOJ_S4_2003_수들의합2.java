import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_S4_2003_수들의합2 {
   static int N, M, cnt;
   static int [] arr;

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      N = Integer.parseInt(st.nextToken());
      M = Integer.parseInt(st.nextToken());
      arr = new int[N];
      
      st = new StringTokenizer(br.readLine());
      for (int i = 0; i < N; i++) {
         arr[i] = Integer.parseInt(st.nextToken());
      }
      
      find();
      
      System.out.println(cnt);
      
   }

   private static void find() {
      int left = 0;
      int right = 0;
      int sum = 0;
      
      while(right <= N) {
         if(sum >= M) {
             sum -= arr[left++];
         } else if(sum < M) {
        	 if(right == N) break;
        	 sum += arr[right++];
         } 
         
         if(sum == M) cnt++;
         
      }
      
   }

}
