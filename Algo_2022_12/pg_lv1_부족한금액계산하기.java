class pg_lv1_부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int newPrice = price;
        for(int i=0;i<count;i++) {
            answer += newPrice;
            newPrice += price;
        }
        
        long result = answer - money;
        if(result < 0) result = 0;

        return result;
    }
}
