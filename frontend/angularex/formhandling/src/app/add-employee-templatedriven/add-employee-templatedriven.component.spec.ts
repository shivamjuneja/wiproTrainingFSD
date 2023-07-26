import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEmployeeTemplatedrivenComponent } from './add-employee-templatedriven.component';

describe('AddEmployeeTemplatedrivenComponent', () => {
  let component: AddEmployeeTemplatedrivenComponent;
  let fixture: ComponentFixture<AddEmployeeTemplatedrivenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddEmployeeTemplatedrivenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEmployeeTemplatedrivenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
