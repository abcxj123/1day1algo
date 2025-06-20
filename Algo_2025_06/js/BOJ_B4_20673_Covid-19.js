const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const p = +input[0];
const q = +input[1];

if (q > 30) console.log("Red");
else if (p <= 50 && q <= 10) console.log("White");
else console.log("Yellow");
