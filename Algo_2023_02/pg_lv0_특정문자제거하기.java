class pg_lv0_특정문자제거하기 {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        char let = letter.charAt(0);
        
        for(int i=0;i<my_string.length();i++) {
            char c = my_string.charAt(i);
            if(c != let) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
