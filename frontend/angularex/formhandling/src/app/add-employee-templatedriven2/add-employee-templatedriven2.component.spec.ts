import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddEmployeeTemplatedriven2Component } from './add-employee-templatedriven2.component';

describe('AddEmployeeTemplatedriven2Component', () => {
  let component: AddEmployeeTemplatedriven2Component;
  let fixture: ComponentFixture<AddEmployeeTemplatedriven2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddEmployeeTemplatedriven2Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddEmployeeTemplatedriven2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
