import { Injectable } from '@angular/core';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  employees: Employee[] = [
    new Employee('gautam', 21),
    new Employee('ajinkya', 22),
  ];

  getAllEmployees(): Employee[] {
    return this.employees;
  }

  findEmployeeByName(name: string): Employee {
    for (let emp of this.employees) {
      if (emp.name === name) {
        return emp;
      }
    }
    return undefined;
  }

  addEmployee(employee:Employee){
    this.employees.push(employee);
  }
}
