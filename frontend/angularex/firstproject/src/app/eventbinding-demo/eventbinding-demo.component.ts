import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'eventbinding-demo',
  templateUrl: './eventbinding-demo.component.html',
  styleUrls: ['./eventbinding-demo.component.css']
})
export class EventbindingDemoComponent {

  counter: number = 0;
  username: string = '';

  increment() {
    this.counter++;
    console.log('counter=' + this.counter);
  }

  changeUsername(username: string) {
    this.username = username;
    console.log('new name=' + this.username);
  }


}
