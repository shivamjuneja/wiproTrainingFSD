import { Component, OnDestroy, OnInit } from '@angular/core';
import { Observable, Subscription } from 'rxjs';
import { TimeService } from '../service/time.service';

@Component({
  selector: 'display-date',
  templateUrl: './display-date.component.html',
  styleUrls: ['./display-date.component.css'],
})
export class DisplayDateComponent implements OnDestroy{
  date: Date | undefined;
  subscription: Subscription;

  constructor(private service: TimeService) {}
  
  fetchDate() {
    const observer = {
      next: (result: Date) => {
        this.date = result;
        console.log("result received");
      },

      error: (error: Error) => {
      console.log("error is "+error);
      },

      complete:()=>{
        console.log("completed");
      }
    };

    const observable: Observable<Date> = this.service.fetchDate();
    console.log("after observable received");
    this.subscription=observable.subscribe(observer);
  }

  ngOnDestroy(): void {
    this.subscription.unsubscribe();
  }


}
