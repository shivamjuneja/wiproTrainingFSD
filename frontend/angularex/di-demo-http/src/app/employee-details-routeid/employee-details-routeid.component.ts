import { Component, OnInit } from '@angular/core';
import {
  ActivatedRoute,
  ActivatedRouteSnapshot,
  ParamMap,
} from '@angular/router';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';
import { EmployeeService } from '../services/employee.service';

@Component({
  selector: 'app-employee-details-routeid',
  templateUrl: './employee-details-routeid.component.html',
  styleUrls: ['./employee-details-routeid.component.css'],
})
export class EmployeeDetailsRouteidComponent {
  employee: Employee | undefined;
  errMsg: string | undefined;
  
  constructor( route: ActivatedRoute, private service: EmployeeService) {
    const observer = {
      next: (result: ParamMap) => {
        const idValue = result.get('id');
        const id: number = parseInt(idValue);
        console.log("id fetched from route="+id)
        this.findEmployeeById(id);
      }
    };
    const observable: Observable<ParamMap> = route.paramMap;
    observable.subscribe(observer);
  }
  

  /*
  constructor(route: ActivatedRoute, private service: EmployeeService) {
    const routeSnapShot: ActivatedRouteSnapshot = route.snapshot;
    const paramMap: ParamMap = routeSnapShot.paramMap;
    const idValue = paramMap.get('id');
    const id: number = parseInt(idValue);
    console.log('id fetched from route=' + id);
    this.findEmployeeById(id);
  }
*/
  findEmployeeById(id: number) {
    const observer = {
      next: (result: Employee) => {
        this.employee = result;
        this.errMsg = undefined;
      },

      error: (error: Error) => {
        console.log(error);
        this.errMsg = error.message;
        console.log('error is ' + this.errMsg);
        this.employee = undefined;
      },
    };
    const observabe: Observable<Employee> = this.service.fetchEmployeeById(id);
    observabe.subscribe(observer);
  }
}
