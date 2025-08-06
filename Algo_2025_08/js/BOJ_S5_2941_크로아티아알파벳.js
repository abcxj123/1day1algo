const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim();

const patterns = new Set(["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]);

let ans = 0;
for (let i = 0; i < input.length; i++) {
  if (i + 2 < input.length && patterns.has(input.substring(i, i + 3))) {
    i += 2;
  } else if (i + 1 < input.length && patterns.has(input.substring(i, i + 2))) {
    i++;
  }

  ans++;
}

console.log(ans);
