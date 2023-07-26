import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'smallest'
})
export class SmallestPipe implements PipeTransform {

  transform(values: number[]): number {
     let min=values[0];
     for(let num of values){
       if(num<min){
         min=num;
       }
     }
     return min;

  }

}
