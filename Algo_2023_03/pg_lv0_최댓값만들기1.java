import java.util.*;

class pg_lv0_최댓값만들기1 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }
}
