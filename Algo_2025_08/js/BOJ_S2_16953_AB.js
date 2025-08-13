const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim();

const [A, B] = input.split(" ").map(Number);
let ans = Number.MAX_SAFE_INTEGER;
dfs(0, B);

console.log(ans === Number.MAX_SAFE_INTEGER ? -1 : ans);

function dfs(depth, num) {
  if (num < A) return;

  if (num === A) {
    ans = Math.min(ans, depth + 1);
    return;
  }

  if (num % 2 === 0) {
    dfs(depth + 1, num / 2);
  }

  if (num % 10 === 1) {
    dfs(depth + 1, Math.floor(num / 10));
  }
}
