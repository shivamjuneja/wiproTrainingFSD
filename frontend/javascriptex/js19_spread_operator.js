/*
spread operator
*/

let array1=[1,2,3,4];
let array2=[5,6,7,8];
let array3=[...array1,...array2];

for(let num of array3){
    console.log(num);
}
