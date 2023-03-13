import java.util.*;

class pg_lv0_제곱수판별하기 {
    public int solution(int n) {
        int answer = 0;
        double num = Math.sqrt(n);
        int num2 = (int)num;
        if(num - num2 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
