import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Employee } from '../model/employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css'],
})
export class AddEmployeeComponent {
  nameCtrl: FormControl;
  ageCtrl: FormControl;
  myform: FormGroup;
  isSent:boolean=false;
  constructor(builder: FormBuilder, private service: EmployeeService) {
    this.nameCtrl = builder.control('');
    this.ageCtrl = builder.control('');
    const mapping = {
      empName: this.nameCtrl,
      empAge: this.ageCtrl,
    };
    this.myform = builder.group(mapping);
  }

  addEmployee() {
    const name:string=this.nameCtrl.value;
    const age=this.ageCtrl.value;
    const employee:Employee=new Employee(name,age);
    this.service.addEmployee(employee);
    this.isSent=true;
  }
}
