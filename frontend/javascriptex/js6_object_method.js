/*
object demo with function
*/

var user1 = {
    username: "rupesh",
    age: 21,
    displayUser: function () {
        console.log("username=" + this.username + " " + this.age);
    }

};


var user2 = {
    username: "sayantan",
    age: 22,
    displayUser: function () {
        console.log("username=" + this.username + " " + this.age);
    }

};

user1.displayUser();
user2.displayUser();

var users = [user1, user2];
console.log("iterating on array and displaying user details");
for (var i = 0; i < users.length; i++) {
    var iterated = users[i];
    iterated.displayUser();
}

