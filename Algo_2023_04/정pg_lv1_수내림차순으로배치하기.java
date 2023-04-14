import java.io.*;
import java.util.*;

class 정pg_lv1_수내림차순으로배치하기 {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(n);
        int length = str.length();
        int [] arr = new int[length];
        
        for(int i=0;i<length;i++) {
            arr[i] = str.charAt(i) - '0';
        }
        
        Arrays.sort(arr);
        
        for(int i=length-1;i>=0;i--) {
            sb.append(arr[i]);
        }
        
        return Long.parseLong(sb.toString());
    }
}
