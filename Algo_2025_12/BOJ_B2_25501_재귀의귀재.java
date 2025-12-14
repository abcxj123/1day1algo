import java.util.Scanner;

public class BOJ_B2_25501_재귀의귀재 {
	static int ans;
	
	public static void main(String[] args){
    	Scanner scann = new Scanner(System.in);
    	
    	int T = scann.nextInt();
    	scann.nextLine();
    	
    	for(int i = 0; i < T; i++) {
    		String s = scann.nextLine();
    		
    		ans = 0;	
    		
    		System.out.println(isPalindrome(s)+" "+ans);
    	}
    }
    
    public static int recursion(String s, int l, int r){
    	ans++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    
}
