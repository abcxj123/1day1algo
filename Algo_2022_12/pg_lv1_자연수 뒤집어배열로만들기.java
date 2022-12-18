import java.util.*;

class pg_lv1_자연수 뒤집어배열로만들기 {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        while(n >= 10) {
            long num = (n % 10);
            answer.add((int)num);
            n /= 10;
        }
        answer.add((int)n);
        return answer;
    }
}
