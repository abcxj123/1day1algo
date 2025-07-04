const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

let N = +input[0];
const name = "anj";

for (let i = 1; i <= N; i++) {
  const s = input[i].trim();

  if (s === name) {
    console.log("뭐야;");
    return;
  }
}

console.log("뭐야?");
