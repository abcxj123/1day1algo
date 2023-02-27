import java.io.*;
import java.util.*;

class pg_lv0_짝수는싫어요 {
    public List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if(i%2 != 0) {
                list.add(i);
            }
        }
        return list;
    }
}
