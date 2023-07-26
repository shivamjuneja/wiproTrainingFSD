import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEmployeeCodedrivenComponent } from './add-employee-codedriven.component';

describe('AddEmployeeCodedrivenComponent', () => {
  let component: AddEmployeeCodedrivenComponent;
  let fixture: ComponentFixture<AddEmployeeCodedrivenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddEmployeeCodedrivenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEmployeeCodedrivenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
