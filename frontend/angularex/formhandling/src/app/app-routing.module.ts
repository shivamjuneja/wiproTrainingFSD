import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeeCodedrivenComponent } from './add-employee-codedriven/add-employee-codedriven.component';
import { AddEmployeeTemplatedrivenComponent } from './add-employee-templatedriven/add-employee-templatedriven.component';
import { AddEmployeeTemplatedriven2Component } from './add-employee-templatedriven2/add-employee-templatedriven2.component';

const routes: Routes = [
  {
    path: 'form-templatedriven',
    component: AddEmployeeTemplatedrivenComponent,
  },
  {
    path: 'form-templatedriven2',
    component: AddEmployeeTemplatedriven2Component,
  },

  {
    path: 'form-codedriven',
    component: AddEmployeeCodedrivenComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
