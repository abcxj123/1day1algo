import java.util.*;

class pg_lv1_예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d);
        for(int i=0;i<d.length;i++) {
            int n = d[i];
            if(sum + n <= budget) {
                answer++;
                sum += n;
            } else break;
        }
        return answer;
    }
}
