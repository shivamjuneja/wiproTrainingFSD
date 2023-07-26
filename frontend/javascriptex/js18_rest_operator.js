

function add(...numbers) {
    let total = 0;
    for (let num of numbers) {
      total=total+num;
    }
    return total;
}

let result1=add();
let result2=add(1);
let result3=add(4,5,6);
console.log("result1="+result1+", result2="+result2+", result3="+result3);
