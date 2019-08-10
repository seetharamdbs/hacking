import { Component, OnInit, Input } from '@angular/core';
import { QueueService } from '../queue.service';

@Component({
  selector: 'app-addqueue',
  templateUrl: './addqueue.component.html',
  styleUrls: ['./addqueue.component.css']
})
export class AddqueueComponent implements OnInit {

  
  @Input('isAddQueue') isAddQueue: boolean;

  name:string;
  size:number;

  constructor(private service: QueueService) { }

  ngOnInit() {
  }

  add() {
     this.service.addQueue(this.name,this.size).subscribe(
       (data) => 
         console.log(data)
     );
  }

}
