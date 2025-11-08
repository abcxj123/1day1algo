const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim();

let binary = '0b' + input;
let ans = (BigInt(binary) * 17n).toString(2);

console.log(ans);
