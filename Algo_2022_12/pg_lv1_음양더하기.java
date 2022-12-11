class pg_lv1_음양더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<signs.length;i++) {
            int n = absolutes[i];
            if(signs[i]) {
                answer += n;
            } else {
                answer -= n;
            }
        }
        return answer;
    }
}
