class pg_lv0_암호해독 {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        for(int i=0;i<cipher.length();i++) {
            if(i%code == code-1) {
                sb.append(cipher.charAt(i));
            }
        }
        return sb.toString();
    }
}
