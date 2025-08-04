const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().split("\n");

const arr = input[0].split("").map(Number);
arr.sort((o1, o2) => o2 - o1);

const sum = arr.reduce((acc, n) => acc + n, 0);

if (sum % 3 !== 0 || arr[arr.length - 1] !== 0) console.log(-1);
else console.log(arr.join(""));
