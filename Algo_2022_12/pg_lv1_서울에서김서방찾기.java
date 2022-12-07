import java.util.*;

class pg_lv1_서울에서김서방찾기 {
    public String solution(String[] seoul) {
        List<String> list = Arrays.asList(seoul);
        int idx = list.indexOf("Kim");
        String answer = "김서방은 "+idx+"에 있다";
        return answer;
    }
}
