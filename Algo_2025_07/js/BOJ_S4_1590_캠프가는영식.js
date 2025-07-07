const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const [N, T] = input[0].trim().split(" ").map(Number);
let res = Number.MAX_SAFE_INTEGER;

for (let t = 1; t <= N; t++) {
  const [S, I, C] = input[t].trim().split(" ").map(Number);

  for (let i = 0; i < C; i++) {
    const time = S + I * i;

    if (T <= time) {
      res = Math.min(res, time - T);
      break;
    }
  }
}

if (res === Number.MAX_SAFE_INTEGER) console.log(-1);
else console.log(res);
