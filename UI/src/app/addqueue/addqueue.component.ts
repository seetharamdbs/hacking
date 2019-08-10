import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-addqueue',
  templateUrl: './addqueue.component.html',
  styleUrls: ['./addqueue.component.css']
})
export class AddqueueComponent implements OnInit {

  
  @Input('isAddQueue') isAddQueue: boolean;


  constructor() { }

  ngOnInit() {
  }

}
