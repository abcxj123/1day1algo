const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

let T = +input[0];
let ans = "";

for (let t = 1; t <= T; t++) {
  let [a, b] = input[t].trim().split(" ");
  a = +a;

  if (b === "kg") {
    a *= 2.2046;
    b = "lb";
  } else if (b === "lb") {
    a *= 0.4536;
    b = "kg";
  } else if (b === "l") {
    a *= 0.2642;
    b = "g";
  } else if (b === "g") {
    a *= 3.7854;
    b = "l";
  }

  ans += `${a.toFixed(4)} ${b}\n`;
}

console.log(ans);
