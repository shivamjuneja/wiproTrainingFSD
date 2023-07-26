import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private client:HttpClient){

  }
  
  getAllEmployees(): Observable<Employee[]> {
    const url="http://localhost:3000/employees"; 
    const observable:Observable<Employee[]>=this.client.get<Employee[]>(url);
    return observable;
  }

  fetchEmployeeById(id: number): Observable<Employee> {
    const url="http://localhost:3000/employees/"+id;
    const observable:Observable<Employee>=this.client.get<Employee>(url);
    return observable; 
  }

  addEmployee(requestData:Employee):Observable<Employee>{
    const url="http://localhost:3000/employees"; 
    const observable:Observable<Employee>=this.client.post<Employee>(url,requestData);
    return observable;
  }
}
