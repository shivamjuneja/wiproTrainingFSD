class Employee{

constructor(public name:string){
}

displayDetails():void{
console.log("employee "+this.name);
}

}

let emp:Employee=new Employee('govind');
emp.displayDetails();