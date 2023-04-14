class pg_lv1_삼총사 {
    static int answer;
    static int N;
    static boolean [] v;
    
    public int solution(int[] number) {
        N = number.length;
        v = new boolean[N];
        
        combi(number, 0, 0, 0);
        
        return answer;
    }
    
    static void combi(int [] number, int start, int cnt, int sum) {
        if(cnt == 3) {
            if(sum == 0) {
                answer++;
            }
            return ;
        }
        
        for(int i=start;i<N;i++) {
            if(v[i]) continue;
            
            v[i] = true;
            combi(number, i+1, cnt+1, sum+number[i]);
            v[i] = false;
        }
        
    }
}
