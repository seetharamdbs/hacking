import { Component, OnInit, Input } from '@angular/core';
import { QueueService } from '../queue.service';
import { list } from '../queuelist/list';

@Component({
  selector: 'app-addqueue',
  templateUrl: './addqueue.component.html',
  styleUrls: ['./addqueue.component.css']
})
export class AddqueueComponent implements OnInit {

  
  @Input('isAddQueue') isAddQueue: boolean;

  name:string;
  size:number;
  list:list[]=[{name:'Akhil',size:1,id:1},{name:'queue',size:2,id:2}]

  constructor(private service: QueueService) { }

  ngOnInit() {
  }

  add() {
     this.service.addQueue(this.name,this.size).subscribe(
       (data) => 
         
         this.list = data
     );
  }

}
