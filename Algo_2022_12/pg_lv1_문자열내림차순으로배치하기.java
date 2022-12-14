import java.util.*;

class pg_lv1_문자열내림차순으로배치하기 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            list.add(c);
        }
        Collections.sort(list, Collections.reverseOrder());
        for(char c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}
