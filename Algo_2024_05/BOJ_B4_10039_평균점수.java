import java.util.*;
import java.io.*;

public class BOJ_B4_10039_평균점수 {

	public static void main(String[] args) {
		 Scanner scann = new Scanner();

      int sum = 0;

      for(int i=0;i<5;i++) {
        int n = scann.nextInt();
        
        if(n < 40) n = 40;
        
        sum += n;
      }

      System.out.println(sum / 5);
	}

}
