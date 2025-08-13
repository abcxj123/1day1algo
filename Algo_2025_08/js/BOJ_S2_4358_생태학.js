const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

const map = new Map();
const N = input.length;

for (let i = 0; i < N; i++) {
  const tree = input[i].trim();

  map.set(tree, (map.get(tree) || 0) + 1);
}

const list = [...map.keys()].sort();

list.forEach((tree) => {
  console.log(`${tree} ${((map.get(tree) / N) * 100).toFixed(4)}`);
});
