import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Observable } from 'rxjs';
import { Employee } from '../models/employee';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css'],
})
export class EmployeeDetailsComponent {
  employees = [
    { id: 1, name: 'sourav' },
    { id: 2, name: 'arghya' },
    { id: 3, name: 'sayantan' },
  ];

  id: number | undefined;
  employee:Employee|undefined;
  constructor(route: ActivatedRoute) {
    const observer={next:(paramMap:ParamMap)=>{
     const idString=paramMap.get('id');
     this.id=parseInt(idString); 
     this.employee=this.findEmployeeById(this.id);
    }}; 
    const observable: Observable<ParamMap> = route.paramMap;
    observable.subscribe(observer);
  }

  findEmployeeById(id:number){
    for (let emp of this.employees){
      if(emp.id===id)
      {
        return emp;
      }
    }
    return undefined;
  }
}
