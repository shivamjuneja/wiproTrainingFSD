class Student{
    
    constructor(name, age){
       this.name=name;
       this.age=age;
    }

    displayDetails(){
        console.log("name="+this.name);
        console.log("age="+this.age);
    }

}

class CseStudent extends Student{
 constructor(name,age, language){
     super(name,age);
     this.language=language;
 }

 displayDetails(){
     super.displayDetails();
     console.log("language="+this.language);
 }

}

let student1=new CseStudent('govind',21,'java');
student1.displayDetails();