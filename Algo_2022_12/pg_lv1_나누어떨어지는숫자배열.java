import java.util.*;

class pg_lv1_나누어떨어지는숫자배열 {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()) {
            list.add(-1);
        }
        return list;
    }
}
