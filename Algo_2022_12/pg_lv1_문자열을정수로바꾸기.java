class pg_lv1_문자열을정수로바꾸기 {
    public int solution(String s) {
        boolean flag = false;
        if(s.charAt(0) == '-') {
            flag = true;
            s = s.substring(1, s.length());
        } else if(s.charAt(0) == '+') {
            s = s.substring(1, s.length());
        }
        
        int answer = Integer.parseInt(s);
        if(flag) answer *= -1;
        
        return answer;
    }
}
