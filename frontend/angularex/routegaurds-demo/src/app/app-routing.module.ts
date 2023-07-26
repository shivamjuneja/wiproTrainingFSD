import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { ErrorsComponent } from './errors/errors.component';
import { UrlGuard } from './url.guard';

const routes: Routes = [
{path: 'employee/:id', component:EmployeeDetailsComponent, canActivate:[ UrlGuard]},
{
  path:"error",component:ErrorsComponent
}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
