class pg_lv1_없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean [] check = new boolean[10];
        
        for(int i=0;i<numbers.length;i++) {
            int n = numbers[i];
            check[n] = true;
        }
        
        for(int i=0;i<=9;i++) {
            if(!check[i]) answer += i;
        }
        
        return answer;
    }
}
