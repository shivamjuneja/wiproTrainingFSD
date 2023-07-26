/*
arraow functions
*/

let fun1=function(num1,num2){
    let sum=num1+num2;
    return sum;
}

let reult=fun1(1,2);

let fun2=(num1,num2)=>num1+num2;

let fun3=(num1, num2)=>{
    let result=num1+num2;
    return result;
}

let result2=fun2(4,5);
let result3=fun3(5,6);

console.log("result2="+result2);
console.log("result3="+result3);