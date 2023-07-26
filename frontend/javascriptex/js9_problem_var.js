/*
var is function scoped
*/


function displayMessage(){
    msg="hello";
    console.log("message="+msg);
    if(true){
        var msg="hi";
    }
    console.log("message="+msg);

}

displayMessage();