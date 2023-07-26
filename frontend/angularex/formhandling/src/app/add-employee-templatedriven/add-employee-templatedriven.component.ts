import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Employee } from '../models/Employee';

@Component({
  selector: 'add-employee-templatedriven',
  templateUrl: './add-employee-templatedriven.component.html',
  styleUrls: ['./add-employee-templatedriven.component.css'],
})
export class AddEmployeeTemplatedrivenComponent {

   //isEmployeeAdded:boolean;
   employee:Employee|undefined;  

  
  addEmployee(myform: any): void {
    const data=myform.value;
    console.log('inside addEmployee form data', data);
    const empName=data.empName;
    const empAge=data.empAge;
    const formGroup=myform.form;
    if(!formGroup.valid){
      formGroup.markAllAsTouched();
      return;
    }    

    if(!this.isAgeValid(empAge)){
       return;  
    }
    this.employee=new Employee(empName,empAge);
  //  this.isEmployeeAdded=true;
  }

  isAgeRequiredValid(control:FormControl){
    const touchedOrDirty=this.isTouchedOrDirty(control);
    if (!touchedOrDirty) {
      return true;
    }

   return ! control.errors?.required ;
  }

  isAgeValid(control:FormControl):boolean{
    const touchedOrDirty=this.isTouchedOrDirty(control);
    if (!touchedOrDirty) {
      return true;
    }
    const age=control.value;
    return age>=18 && age<=100;
  }
 

  isTouchedOrDirty(control: FormControl): boolean {
    return control.touched || control.dirty;
  }

  isNameCtrlRequireValid(control:FormControl) {
    const touchedOrDirty=this.isTouchedOrDirty(control);
    if (!touchedOrDirty) {
      return true;
    }
    return !control.errors?.required;
  }

  isNameCtrlMinLengthValid(control:FormControl) {
    const touchedOrDirty=this.isTouchedOrDirty(control);
    if (!touchedOrDirty) {
      return true;
    }
    return !control.errors?.minlength;
  }

  
}
