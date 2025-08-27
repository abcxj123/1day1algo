const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const N = +input[0];
const nums = input[1].trim().split(" ").map(Number);
const M = +input[2];

const dp = Array.from(new Array(N), () => new Array(N).fill(false));

// 길이 1
for (let i = 0; i < N; i++) {
  dp[i][i] = true;
}

// 길이 2
for (let i = 0; i < N - 1; i++) {
  if (nums[i] === nums[i + 1]) {
    dp[i][i + 1] = true;
  }
}

// 길이 3 이상
for (let i = 2; i < N; i++) {
  for (let j = 0; j < N - i; j++) {
    if (nums[j] === nums[j + i] && dp[j + 1][j + i - 1]) {
      dp[j][j + i] = true;
    }
  }
}

let ans = [];

for (let t = 3; t < 3 + M; t++) {
  const [S, E] = input[t]
    .trim()
    .split(" ")
    .map((s) => Number(s) - 1);

  if (dp[S][E]) ans.push(1);
  else ans.push(0);
}

console.log(ans.join("\n"));
