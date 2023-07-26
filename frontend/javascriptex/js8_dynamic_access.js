/*
fetch dynamically values of object
*/

var user={
    name: "arghya",
    age:21
};

var name1=user.name;
var age1=user.age;

var name2=user['name'];
var age2= user['age'];

console.log("name2="+name2);
console.log("age2="+age2);

function getValue(obj,fieldName){
   var value= obj[fieldName];
   return value;
}

var age3=getValue(user,'age');
var name3=getValue(user,'name');
console.log("name3="+name3);
console.log("age3="+age3);