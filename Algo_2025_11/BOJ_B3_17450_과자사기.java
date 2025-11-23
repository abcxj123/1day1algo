import java.util.Scanner;

public class BOJ_B3_17450_과자사기 {

	public static void main(String[] args) {
		 Scanner scann = new Scanner(System.in);
	        
	        double max = 0;
	        String ans = "";
	        
	        for (int i = 0; i < 3; i++) {
	            double price = scann.nextDouble();
	            double weight = scann.nextDouble();
	            
	            double cal = 0;
	            
	            if (price*10 >= 5000) {
	            	cal = (weight*10) / (price*10 - 500);
	            }
	            else {
	            	cal = (weight*10) / (price*10);
	            }
	            
	            if (max < cal) {
	                max = cal;
	                if (i == 0) ans = "S";
	                else if (i == 1) ans = "N";
	                else if (i == 2) ans = "U";
	            }
	        }
	        
	        System.out.print(ans);

	}

}
