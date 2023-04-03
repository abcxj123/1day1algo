import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_S2_사이버개강총회 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<String> set1 = new HashSet<>();
        Set<String> attend = new HashSet<>();

        String [] str1 = st.nextToken().split(":");
        String [] str2 = st.nextToken().split(":");
        String [] str3 = st.nextToken().split(":");

        int start = Integer.parseInt(str1[0])*60 + Integer.parseInt(str1[1]);
        int end = Integer.parseInt(str2[0])*60 + Integer.parseInt(str2[1]);
        int stream = Integer.parseInt(str3[0])*60 + Integer.parseInt(str3[1]);

        String input = null;

        while((input = br.readLine()) != null) {
           
            String [] arr = input.split(" ");
            String [] tmp = arr[0].split(":");

            int time = Integer.parseInt(tmp[0])*60+Integer.parseInt(tmp[1]);
            if(time <= start) {
               set1.add(arr[1]);
            } else if(time >= end && time <= stream) {
               if(set1.contains(arr[1])) {
                  attend.add(arr[1]);
               }
            } else if(time > stream) break;
        }
        
        System.out.println(attend.size());

    }

}
