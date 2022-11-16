import java.io.*;
import java.util.*;

class pg_lv2_최솟값만들기
{
    public int solution(int []A, int []B)
    {
        int ans = 0;
        Integer [] BTmp = new Integer[A.length];
        for(int i=0;i<A.length;i++) {
            BTmp[i] = B[i];
        }
        Arrays.sort(A);
        Arrays.sort(BTmp, Collections.reverseOrder());
        
        for(int i=0;i<A.length;i++) {
            int a = A[i];
            int b = BTmp[i];
            ans += a*b;
        }

        return ans;
    }
}
