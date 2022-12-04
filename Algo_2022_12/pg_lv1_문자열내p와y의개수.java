class pg_lv1_문자열내p와y의개수 {
    boolean solution(String s) {
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == 'p' || c == 'P') cnt1++;
            else if(c == 'y' || c == 'Y') cnt2++;
        }
        
        if(cnt1 == cnt2) return true;
        else return false;
    }
}
