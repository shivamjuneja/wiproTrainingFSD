/*
array 
*/

var numbers = [10, 11, 12, 13];
var words = ["good", "bad", "hi"];

for (var i = 0; i < numbers.length; i++) {
    var iterated = numbers[i];
    console.log("number=" + iterated);
}

for (var i = 0; i < words.length; i++) {
    var iterated = words[i];
    console.log("iteratd word=" + iterated);

}

var numbersTill9 = [];
for (var i = 0; i < 10; i++) {
    numbersTill9.push(i);
}
console.log("array size now=" + numbersTill9.length);

for (var i = 0; i < numbersTill9.length; i++) {
    console.log("number=" + i);
}
