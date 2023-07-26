/*
rest operator
*/

let array1=[1,2,3,4];

let [num1,...remaining]=array1;

console.log("num1="+num1);

for (let iterated of remaining){
    console.log(iterated);
}