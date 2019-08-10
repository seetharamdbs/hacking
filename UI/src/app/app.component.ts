import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

 
export class AppComponent {
  title = 'MessagingQueue';

  pop(){
    console.log("working");
    
  }
  isAddQueue:boolean =false;
}

