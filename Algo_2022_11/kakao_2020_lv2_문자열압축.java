import java.util.*;

// 1. String s의 길이 length를 구한다.
// 2. 1부터 length/2 까지의 수에 대해 문자열을 압축해보고 그 길이를 구한다.
// 3. why length/2? -> 그 이상의 수는 압축이 안되기 때문이다. (중복되는 문자열이 없음)
// 4. min 값을 갱신한다.
// 5. 모든 계산이 끝나면, min값을 리턴한다.

class kakao_2020_lv2_문자열압축 {
    public int solution(String s) {
        int length = s.length();
        if(length == 1) return 1;
        
        int min = length;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1;i<=length/2;i++) {
            list.add(i);
        }
        
        for(int n : list) {
            String ans = "";
            int idx = n;
            int cnt = 1;
            String str = s.substring(0, n);
            while(idx < length) {
                String tmp = "";
                if(idx+n >= length) {
                    tmp = s.substring(idx, length);
                } else {
                    tmp = s.substring(idx, idx+n);
                }
                idx += n;
                if(str.equals(tmp)) {
                    cnt++;
                } else {
                    if(cnt == 1) {
                        ans += str;
                    } else if(cnt > 1) {
                        ans += String.valueOf(cnt);
                        ans += str;
                    }
                    str = tmp;
                    cnt = 1;
                }
                
                if(idx >= length) {
                    if(cnt == 1) {
                        ans += str;
                    } else if(cnt > 1) {
                        ans += String.valueOf(cnt);
                        ans += str;
                    }
                    str = tmp;
                    cnt = 1;
                }
            }
            int ansLength = ans.length();
            min = Math.min(min, ansLength);
        }
        
        return min;
    }
}
