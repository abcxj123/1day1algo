class pg_lv0_머쓱이보다키큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0;i<array.length;i++) {
            int n = array[i];
            if(n > height) answer++;
        }
        return answer;
    }
}
