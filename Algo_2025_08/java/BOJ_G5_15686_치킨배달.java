import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_G5_15686_치킨배달 {

	 static int N, M, H, S, ans;
	    static List<int[]> houses, shops;
	    static int [][] dist;
	    static boolean [] v;

	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        N = Integer.parseInt(st.nextToken());
	        M = Integer.parseInt(st.nextToken());
	        ans = Integer.MAX_VALUE;
	        houses = new ArrayList<>();
	        shops = new ArrayList<>();

	        for (int i = 0; i < N; i++) {
	            st = new StringTokenizer(br.readLine());
	            for (int j = 0; j < N; j++) {
	                int n = Integer.parseInt(st.nextToken());
	                
	                if (n == 1) houses.add(new int[] {i, j});
	                else if (n == 2) shops.add(new int[] {i, j});
	            }
	        }

	        H = houses.size();
	        S = shops.size();
	        
	        dist = new int[H][S];
	        v = new boolean[S];

	        for (int i = 0; i < H; i++) {
	            int hr = houses.get(i)[0];
	            int hc = houses.get(i)[1];
	            
	            for (int j = 0; j < S; j++) {
	                int sr = shops.get(j)[0];
	                int sc = shops.get(j)[1];
	                dist[i][j] = Math.abs(hr - sr) + Math.abs(hc - sc);
	            }
	        }

	        combi(0, 0);
	        
	        System.out.println(ans);
	    }

	    static void combi(int start, int depth) {
	        if (depth == M) {
	            int total = 0;
	            
	            for (int i = 0; i < H; i++) {
	                int best = Integer.MAX_VALUE;
	                for (int j = 0; j < S; j++) {
	                    if(!v[j]) continue;
	                    
	                    int d = dist[i][j];
	                    
	                    if (d < best) best = d;
	                    
	                    if (d == 0) break;
	                }
	                total += best;
	                
	                if (total >= ans) return;
	            }
	            
	            if (total < ans) ans = total;
	            
	            return;
	        }
	        
	        for (int i = start; i < S; i++) {
	        	if(v[i]) continue;
	        	
	        	v[i] = true;
	        	combi(i+1, depth+1);
	        	v[i] = false;
	        }
	    }

}
