import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-list-employees',
  templateUrl: './list-employees.component.html',
  styleUrls: ['./list-employees.component.css'],
})
export class ListEmployeesComponent {
  employees: Employee[] | undefined;

  constructor(private service: EmployeeService) {
    const observer={
      next: (result:Employee[])=>{
         this.employees=result;
      },
      error : (error:Error)=>{
        console.log("error is "+error.message);
      },
      complete: ()=>{
        console.log("completed");
      }
    }
    const observable:Observable<Employee[]> = service.getAllEmployees();
    observable.subscribe(observer);

  }
}
