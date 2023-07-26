import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'propertybinding-demo',
  templateUrl: './propertybinding-demo.component.html',
  styleUrls: ['./propertybinding-demo.component.css']
})
export class PropertybindingDemoComponent  {

  url = 'http://github.com';
  shouldBeHidden = true;
  shouldBeDisabled = true;

}
