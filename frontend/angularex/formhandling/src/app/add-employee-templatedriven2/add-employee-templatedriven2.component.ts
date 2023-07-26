import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { Employee } from '../models/Employee';

@Component({
  selector: 'app-add-employee-templatedriven2',
  templateUrl: './add-employee-templatedriven2.component.html',
  styleUrls: ['./add-employee-templatedriven2.component.css'],
})
export class AddEmployeeTemplatedriven2Component {
  //isEmployeeAdded:boolean;
  isSent: boolean;
  employee: Employee = new Employee('', 0);

  addEmployee(myform: any): void {
    const formGroup = myform.form;
    if (!formGroup.valid) {
      formGroup.markAllAsTouched();
      return;
    }

    if (!this.isAgeValueValid(this.employee.empAge)) {
      return;
    }

    this.isSent = true;
    console.log('inside addEmployee form data', this.employee);

    //  this.isEmployeeAdded=true;
  }

  isAgeRequiredValid(control: FormControl) {
    const touchedOrDirty = this.isTouchedOrDirty(control);
    if (!touchedOrDirty) {
      return true;
    }

    return !control.errors?.required;
  }

  isAgeValueValid(age: number): boolean {
    return age >= 18 && age <= 100;
  }

  isAgeCtrlValid(control: FormControl): boolean {
    const touchedOrDirty = this.isTouchedOrDirty(control);
    if (!touchedOrDirty) {
      return true;
    }
    const age = control.value;
    return this.isAgeValueValid(age);
  }

  isTouchedOrDirty(control: FormControl): boolean {
    return control.touched || control.dirty;
  }

  isNameCtrlRequireValid(control: FormControl) {
    const touchedOrDirty = this.isTouchedOrDirty(control);
    if (!touchedOrDirty) {
      return true;
    }
    return !control.errors?.required;
  }

  isNameCtrlMinLengthValid(control: FormControl) {
    const touchedOrDirty = this.isTouchedOrDirty(control);
    if (!touchedOrDirty) {
      return true;
    }
    return !control.errors?.minlength;
  }
}
