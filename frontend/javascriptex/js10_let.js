/*
let is block  scoped
*/

function display(){

  if(true){
      let msg="hello";
  }  
  console.log(msg);
}

display();