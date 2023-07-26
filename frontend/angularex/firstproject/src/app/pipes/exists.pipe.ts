import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'exists'
})
export class ExistsPipe implements PipeTransform {

  transform(values: any[], searchFor:any): boolean {
    for (let element of values){
      if(element===searchFor){
       return true;
      }
    }
    return false;
  }

}
