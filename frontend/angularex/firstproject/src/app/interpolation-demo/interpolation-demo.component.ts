import { Component, OnInit } from '@angular/core';
import { User } from '../models/User';

@Component({
  selector: 'interpolation-demo',
  templateUrl: './interpolation-demo.component.html',
  styleUrls: ['./interpolation-demo.component.css']
})
export class InterpolationDemoComponent  {

  users = [new User('rupesh', 21), new User('mohit', 22)];


  getDescription(): string {
    let msg = 'i love angular';
    return msg;
  }
}
