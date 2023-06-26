import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_G5_12025_장난꾸러기영훈 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String str = br.readLine();
      long K = Long.parseLong(br.readLine());
      
      char [] nums = new char[str.length()];
      List<Integer> list = new ArrayList<>();
      long number = 1;
      
      for (int i = 0; i < str.length(); i++) {
         char c = str.charAt(i);
         nums[i] = c;
         
         if(c == '1' || c == '6') {
            nums[i] = '1';
            number *= 2;
         } else if(c == '2' || c == '7') {
            nums[i] = '2';
            number *= 2;
         }
      }
      
      for (int i = str.length()-1; i >= 0; i--) {
    	  if(nums[i] == '1' || nums[i] == '2') {
    		  list.add(i);
    	  }
      }
      
      if(K > number) {
         System.out.println(-1);
      } else {
    	 K--;
         StringBuilder sb = new StringBuilder();
         int idx = 0;
         
         while(K > 0) {
            if(K % 2 == 1) {
               if(nums[list.get(idx)] == '1') {
                  nums[list.get(idx)] = '6';
               } else if(nums[list.get(idx)] == '2') {
                  nums[list.get(idx)] = '7';
               }
            }
            
            K /= 2;
            idx++;
            
         }
         
         for (char c : nums) {
            sb.append(c);
         }

         System.out.println(sb.toString());
         
      }

   }

}
