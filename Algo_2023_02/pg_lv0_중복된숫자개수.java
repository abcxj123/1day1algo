class pg_lv0_중복된숫자개수 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for(int i=0;i<array.length;i++) {
            if(n == array[i]) answer++;
        }
        return answer;
    }
}
