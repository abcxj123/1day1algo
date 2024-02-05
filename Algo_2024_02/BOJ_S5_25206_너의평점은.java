import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_S5_25206_너의평점은 {
		static Map<String, Double> map;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new HashMap<String, Double>();
		
		putScores();
		
		int total = 0;
		double sum = 0.0;
		
		for (int i = 0; i < 20; i++) {
			String [] arr = br.readLine().split(" ");
			if(arr[2].equals("P")) continue;
			
			Double credit = Double.parseDouble(arr[1]);
			Double score = map.get(arr[2]);
			
			total += credit;
			sum += credit * score;
		}
		
		System.out.println(sum / total);
		
	}
	private static void putScores() {
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		map.put("F", 0.0);
	}

}
