class pg_lv1_수박수박수박수박수박수 {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while(cnt < n) {
            if(cnt++ % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        return sb.toString();
    }
}
