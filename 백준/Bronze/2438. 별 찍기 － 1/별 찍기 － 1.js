let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let num = Number(input[0]);

result = "";
for (let i = 0; i<num; i++){
    for (let j = 0; j<=i; j++){
        result += "*";
    }
    result +="\n";
}
console.log(result);