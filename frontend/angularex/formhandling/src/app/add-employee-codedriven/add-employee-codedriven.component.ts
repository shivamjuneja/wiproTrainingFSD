import { Component, OnInit } from '@angular/core';
import {
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from '@angular/forms';
import { Employee } from '../models/Employee';

@Component({
  selector: 'app-add-employee-codedriven',
  templateUrl: './add-employee-codedriven.component.html',
  styleUrls: ['./add-employee-codedriven.component.css'],
})
export class AddEmployeeCodedrivenComponent {
  employee: Employee | undefined;

  myform: FormGroup;

  nameCtrl: FormControl;
  ageCtrl: FormControl;

  constructor(builder: FormBuilder) {
    this.nameCtrl = builder.control('', [
      Validators.required,
      Validators.minLength(2),
    ]);
    this.ageCtrl = builder.control('', [
      Validators.required,
      Validators.min(18),
      Validators.max(100),
    ]);
    const mapping = {
      empName: this.nameCtrl,
      empAge: this.ageCtrl,
    };
    this.myform = builder.group(mapping);
  }

  addEmployee() {
    console.log('name ', this.nameCtrl);
    if (!this.myform.valid) {
      this.myform.markAllAsTouched();
      return;
    }
    const empName: string = this.nameCtrl.value;
    const empAge: number = this.ageCtrl.value;
    console.log('inside add employee=' + empName, empAge);
    this.employee = new Employee(empName, empAge);
  }

  isTouchedOrDirty(control: FormControl): boolean {
    return control.touched || control.dirty;
  }

  isNameCtrlRequireValid() {
    const touchedOrDirty=this.isTouchedOrDirty(this.nameCtrl);
    if (!touchedOrDirty) {
      return true;
    }
    return !this.nameCtrl.errors?.required;
  }

  isNameCtrlMinLengthValid() {
    const touchedOrDirty=this.isTouchedOrDirty(this.nameCtrl);
    if (!touchedOrDirty) {
      return true;
    }
    return !this.nameCtrl.errors?.minlength;
  }

  isAgeCtrlRequireValid():boolean {
    const touchedOrDirty=this.isTouchedOrDirty(this.ageCtrl);
    if(!touchedOrDirty){
      return true;
    }
    return   !this.ageCtrl.errors?.required;
  }

  isAgeCtrlMinMaxValid():boolean {
    const touchedOrDirty=this.isTouchedOrDirty(this.ageCtrl);
    if(!touchedOrDirty){
      return true;
    }
    return !this.ageCtrl.errors?.min && !this.ageCtrl.errors?.max;
  }
}
