class pg_lv1_핸드폰번호가리기 {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String str = "";
        for(int i=0;i<length-4;i++) {
            str += '*';
        }
        String last = phone_number.substring(length-4, length);
        return str+last;
    }
}
