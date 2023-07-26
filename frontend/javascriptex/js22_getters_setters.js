class Employee {


    constructor(id) {
        this._id = id;
    }

    get id() {
        console.log("inside getter")
        return this._id;
    }

    set id(id){
        console.log("inside setter input="+id);
        this._id=id;
    }


}

let emp = new Employee(20);
let idVal=emp.id;
console.log("id is="+idVal);
emp.id=20;