import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'employee-details-byid',
  templateUrl: './employee-details-byid.component.html',
  styleUrls: ['./employee-details-byid.component.css'],
})
export class EmployeeDetailsByidComponent {
  employee:Employee|undefined;
  idCtrl: FormControl;
  myform: FormGroup;
  errMsg:string|undefined;
  constructor(builder: FormBuilder, private service: EmployeeService) {
    this.idCtrl = builder.control('');
    const mapping = {
      empId: this.idCtrl,
    };
    this.myform=builder.group(mapping);
  }

  findEmployeeById() {
    const id: number = this.idCtrl.value;
    const observer={
      next: (result:Employee)=>{        
        this.employee=result;
        this.errMsg=undefined;
      },

      error :(error:Error)=>{
        console.log(error);
        this.errMsg=error.message;
        console.log("error is "+this.errMsg);
        this.employee=undefined;
      }

    }
    const observabe:Observable<Employee>=this.service.fetchEmployeeById(id);
    observabe.subscribe(observer);
  }
}
