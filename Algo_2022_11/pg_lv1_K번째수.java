import java.io.*;
import java.util.*;

class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int idx = commands[i][2] - 1;
            
            int [] arr = new int[end-start];
            int cnt = 0;
            
            for(int j=start;j<end;j++) {
                arr[cnt++] = array[j];
            }
            
            Arrays.sort(arr);
            
            answer[i] = arr[idx];
        }
        
        return answer;
    }
}
