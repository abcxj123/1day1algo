import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_B1_10769_행복한지슬픈지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int happy = 0;
		int sad = 0;
		
		while(true) {
			boolean flag = false;
			
			if(str.indexOf(":-)") != -1) {
				str = str.replaceFirst(":-\\)", "");
				happy++;
				flag = true;
			}
			
			if(str.indexOf(":-(") != -1) {
				str = str.replaceFirst(":-\\(", "");
				sad++;
				flag = true;
			}
			
			if(!flag) break;
		}
		
		if(happy == 0 && sad == 0) {
			System.out.println("none");
		} else if(happy == sad) {
			System.out.println("unsure");
		} else if(happy > sad) {
			System.out.println("happy");
		} else if(happy < sad) {
			System.out.println("sad");
		}
		
	}

}
