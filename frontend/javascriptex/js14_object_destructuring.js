/*
object destructuring
*/
let user={
    username:"arghya",
    age:21
};

let username1=user.username;
let age1=user.age;

let {username :username2 , age:age2}=user;
console.log("username2="+username2+",age2="+age2);

let {username, age}=user;

console.log("username="+username+",age="+age);