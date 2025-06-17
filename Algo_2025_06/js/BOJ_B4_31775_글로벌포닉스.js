const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const set = new Set();
set.add("l");
set.add("k");
set.add("p");

input.forEach((s) => {
  const c = s.charAt(0);
  set.delete(c);
});

if (set.size === 0) console.log("GLOBAL");
else console.log("PONIX");
