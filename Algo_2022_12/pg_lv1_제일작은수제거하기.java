import java.util.*;
import java.io.*;

class pg_lv1_제일작은수제거하기 {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for(int i=0;i<arr.length;i++) {
            list.add(arr[i]);
            if(arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        }
        list.remove(idx);
        
        if(list.isEmpty()) {
            list.add(-1);
        }
        
        return list;
    }
}
