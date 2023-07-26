/*
spread operator
*/

let user1={name:"mohit", age:21};
let user2={...user1};
user1.name="somnath";
console.log(user2.name+","+user2.age);

let emp1={name:'srinivas', dept:'dev', comapny:'wipro'};
let emp2={...emp1, name:"divyanshu"};
console.log(emp2.name+","+emp2.dept+","+emp2.comapny);