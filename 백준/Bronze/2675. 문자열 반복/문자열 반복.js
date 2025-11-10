let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

let T = Number(input[0]);
let result ='';
for (let i=1; i<=T; i++){
    let [R,S] = input[i].split(' ');
    for(j=0; j<S.length; j++){
        result += S.charAt(j).repeat(R);
    }
    result += '\n'
}
console.log(result);