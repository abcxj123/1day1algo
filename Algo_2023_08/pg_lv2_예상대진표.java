class Solution
{
    public int pg_lv2_예상대진표(int n, int a, int b)
    {
        int newA = Math.min(a, b);
        int newB = Math.max(a, b);
        a = newA;
        b = newB;
        int ans = 1;
        n /= 2;
        
        while(n > 1) {
            if(b - a <= 1 && (a % 2 == 1 && b % 2 == 0)) {
                break;
            } else {
                ans++;
                if(a % 2 == 0) {
                    a /= 2;   
                } else {
                    a = a/2+1;
                }
                
                if(b % 2 == 0) {
                    b /= 2;
                } else {
                    b = b/2+1;
                }
                
                n /= 2;
            }
        }

        return ans;
    }
}
