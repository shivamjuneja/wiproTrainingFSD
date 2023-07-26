import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddEmployeeTemplatedrivenComponent } from './add-employee-templatedriven/add-employee-templatedriven.component';
import { AddEmployeeCodedrivenComponent } from './add-employee-codedriven/add-employee-codedriven.component';
import { AddEmployeeTemplatedriven2Component } from './add-employee-templatedriven2/add-employee-templatedriven2.component';

@NgModule({
  declarations: [
    AppComponent,
    AddEmployeeTemplatedrivenComponent,
    AddEmployeeCodedrivenComponent,
    AddEmployeeTemplatedriven2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
