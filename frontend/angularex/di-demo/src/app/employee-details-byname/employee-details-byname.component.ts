import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { Employee } from '../model/employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-employee-details-byname',
  templateUrl: './employee-details-byname.component.html',
  styleUrls: ['./employee-details-byname.component.css']
})
export class EmployeeDetailsBynameComponent  {
  employee:Employee|undefined ;

  nameCtrl:FormControl;
  myform:FormGroup
  constructor(builder:FormBuilder,private service:EmployeeService) {
    this.nameCtrl=builder.control('');
   const mapping={
     empName:this.nameCtrl
   }   
   this.myform=builder.group(mapping);
   }

   fetchEmployee(){
     const name:string=this.nameCtrl.value;
    this.employee=this.service.findEmployeeByName(name);
   
    }
}
