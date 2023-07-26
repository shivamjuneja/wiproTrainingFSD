import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css'],
})
export class AddEmployeeComponent {
  employee:Employee|undefined;
  nameCtrl: FormControl;
  ageCtrl: FormControl;
  myform: FormGroup;
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
    const requestData:Employee=new Employee(name,age);
    const observer={
      next:(result:Employee)=>{
        this.employee=result;
      },
      error: (error:Error)=>{
        console.log("error is "+error.message);
      }
  
    }
    const observable:Observable<Employee>=this.service.addEmployee(requestData);
    observable.subscribe(observer);
  }
}
