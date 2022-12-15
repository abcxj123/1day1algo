class pg_lv1_가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 1) {
            char c = s.charAt(s.length()/2);
            answer += c;
        } else {
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        }
        return answer;
    }
}
