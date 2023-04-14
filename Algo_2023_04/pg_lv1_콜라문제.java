import java.io.*;
import java.util.*;

class pg_lv1_콜라문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true) {
            if(n < a) break;
            
            int main = (n / a) * b;
            int remain = n % a;
            answer += main;
            n = main + remain;
        }
        
        return answer;
    }
}
