import java.util.Scanner;

public class BOJ_B4_27267_KOMHAT {

   public static void main(String[] args) {
      Scanner scann = new Scanner(System.in);
      
      int a = scann.nextInt();
      a *= scann.nextInt();
      int c = scann.nextInt();
      c *= scann.nextInt();
      
      if(a > c) System.out.println('M');
      else if(a < c) System.out.println('P');
      else System.out.println('E');

   }

}
