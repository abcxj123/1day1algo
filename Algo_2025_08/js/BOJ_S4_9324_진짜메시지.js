const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const T = +input[0];
let ans = "";

for (let t = 1; t <= T; t++) {
  const s = input[t].trim();
  const cnt = new Array(26).fill(0);

  let check = true;

  for (let i = 0; i < s.length; i++) {
    const c = s[i];

    if (++cnt[c.charCodeAt(0) - "A".charCodeAt(0)] % 3 === 0) {
      if (i + 1 >= s.length || s[i + 1] !== c) {
        check = false;
        break;
      }
      i++;
    }
  }

  if (check) ans += "OK\n";
  else ans += "FAKE\n";
}

console.log(ans);
