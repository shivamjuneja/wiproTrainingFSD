import { Component, OnDestroy, OnInit } from '@angular/core';
import { DemoService } from '../demo.service';
import { Product } from '../model/product';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css'],
})
export class Child1Component implements OnInit, OnDestroy {
  product: Product | undefined;
  intervalId:any;
  date: Date | undefined;
  constructor(private service: DemoService) {
    console.log('inside child1 constructor');
  }

  ngOnInit(): void {
    console.log('inside child1 ngOninit');
    this.product = this.service.getBestProduct();

  this.intervalId=  setInterval(() => {
      this.date = new Date();
      console.log('date calculated', this.date);
    }, 2000);
  }

  ngOnDestroy(): void {
    console.log('inside child1 ondestroy, we can do clearing work here');
    clearInterval(this.intervalId);

  }
}
