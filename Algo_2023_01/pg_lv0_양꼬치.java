class pg_lv0_양꼬치 {
    public int solution(int n, int k) {
        int sheep = 12000*n;
        int drink = 2000*k;
        int service = 2000 * (n / 10);
        return sheep + drink - service;
    }
}
