import { Injectable } from '@angular/core';
import { Product } from './model/product';

@Injectable({
  providedIn: 'root'
})
export class DemoService {

  constructor() { }

  getBestProduct():Product{
   return new Product("samsung",2000);
  }

}
