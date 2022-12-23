class pg_lv1_행렬의덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int leng1 = arr1.length;
        int leng2 = arr1[0].length;
        int[][] answer = new int[leng1][leng2];
        
        for(int i=0;i<leng1;i++) {
            for(int j=0;j<leng2;j++) {
                int n1 = arr1[i][j];
                int n2 = arr2[i][j];
                answer[i][j] = n1+n2;
            }
        }
        return answer;
    }
}
