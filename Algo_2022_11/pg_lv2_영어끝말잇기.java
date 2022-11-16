import java.io.*;
import java.util.*;

class pg_lv2_영어끝말잇기 {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        boolean flag = true;
        int idx = 1;
        int turn = 1;
        String past = "";
        
        for(int i=0;i<words.length;i++) {
            String str = words[i];
            if(i != 0) {
                char pastChar = past.charAt(past.length()-1);
                char strChar = str.charAt(0);
                if(pastChar != strChar) {
                    flag = false;
                    break;
                }
            }
            if(set.contains(str)) {
                flag = false;
                break;
            } else {
                set.add(str);
                past = str;
            }
            idx++;
            if(idx > n) {
                idx = 1;
                turn++;
            }
        }
              
        int [] answer = new int[2];
        
        if(flag) return answer;
        else {
            answer[0] = idx;
            answer[1] = turn;
           return answer; 
        }
    }
}
