function solution(s) {
    var arr = s.split(" ");
    arr.sort((a, b) => {
        return a-b;
    });
    var min = arr[0];
    var max = arr[arr.length-1];
    
    var answer = min+" "+max;
    return answer;
}
