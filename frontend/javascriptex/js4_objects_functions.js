/*
object demo
*/

var user1 = {
    username: 'mohit',
    age: 21

};

var user2 = {
    username: 'rupesh',
    age: 22
};

function displayUser(user) {
    console.log("user=" + user.username + " " + user.age)
}

displayUser(user1);
displayUser(user2);
