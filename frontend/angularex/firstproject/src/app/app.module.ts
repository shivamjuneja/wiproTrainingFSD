import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { ProductDetailsComponent } from './product-details/product-details.component';
import { InterpolationDemoComponent } from './interpolation-demo/interpolation-demo.component';
import { PropertybindingDemoComponent } from './propertybinding-demo/propertybinding-demo.component';
import { EventbindingDemoComponent } from './eventbinding-demo/eventbinding-demo.component';
import { TwowaybindingDemoComponent } from './twowaybinding-demo/twowaybinding-demo.component';
import { TemplatevariableDemoComponent } from './templatevariable-demo/templatevariable-demo.component';
import { StructuraldirectiveDemoComponent } from './structuraldirective-demo/structuraldirective-demo.component';
import { AttributedirectiveDemoComponent } from './attributedirective-demo/attributedirective-demo.component';
import { PipesDemoComponent } from './pipes-demo/pipes-demo.component';
import { LengthPipe } from './pipes/length-pipe.pipe';
import { SmallestPipe } from './pipes/smallest.pipe';
import { ExistsPipe } from './pipes/exists.pipe';

@NgModule({
  declarations: [
    AppComponent,
    ProductDetailsComponent,
    InterpolationDemoComponent,
    PropertybindingDemoComponent,
    EventbindingDemoComponent,
    TwowaybindingDemoComponent,
    TemplatevariableDemoComponent,
    StructuraldirectiveDemoComponent,
    AttributedirectiveDemoComponent,
    PipesDemoComponent,
    LengthPipe,
    SmallestPipe,
    ExistsPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
