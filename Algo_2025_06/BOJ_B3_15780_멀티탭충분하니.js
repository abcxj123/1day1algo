const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const [N, K] = input[0].split(" ").map(Number);
const arr = input[1].split(" ").map(Number);

const cnt = arr.reduce((acc, n) => acc + Math.floor((n + 1) / 2), 0);

if (cnt >= N) console.log("YES");
else console.log("NO");
