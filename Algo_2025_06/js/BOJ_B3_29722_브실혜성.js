const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

let [y, m, d] = input[0].split("-").map(Number);
d += +input[1];
m += Math.floor((d - 1) / 30);
d = ((d - 1) % 30) + 1;
y += Math.floor((m - 1) / 12);
m = ((m - 1) % 12) + 1;

m = String(m).padStart(2, "0");
d = String(d).padStart(2, "0");

console.log(`${y}-${m}-${d}`);
