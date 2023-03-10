import java.util.*;

class pg_lv0_중앙값구하기 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
