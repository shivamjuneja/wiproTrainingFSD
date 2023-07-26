import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class TimeService {
  fetchDate(): Observable<Date> {
    const observable: Observable<Date> = new Observable<Date>((subscriber) => {

      setInterval(()=>{
        const date = new Date();
        subscriber.next(date);
      } ,1000 );
     
    });

    return observable;
  }
}
