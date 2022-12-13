import java.util.*;

public class pg_lv1_같은숫자는싫어 {
    public Integer [] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        int cnt = 0;
        int past = -1;
        for(int i=0;i<arr.length;i++) {
            int n = arr[i];
            if(past != n) {
                list.add(n);
                cnt++;
            }
            past = n;
        }
        
        Integer [] answer = list.toArray(new Integer[cnt]);

        return answer;
    }
}
