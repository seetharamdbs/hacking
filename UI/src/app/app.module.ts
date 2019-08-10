import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FirstComponent } from './first/first.component';
import { QueuelistComponent } from './queuelist/queuelist.component';
import { AddqueueComponent } from './addqueue/addqueue.component';

@NgModule({
  declarations: [
    AppComponent,
    FirstComponent,
    QueuelistComponent,
    AddqueueComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
