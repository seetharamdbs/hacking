import { Component, OnInit } from '@angular/core';
import { list } from './list';

@Component({
  selector: 'app-queuelist',
  templateUrl: './queuelist.component.html',
  styleUrls: ['./queuelist.component.css']
})
export class QueuelistComponent implements OnInit {

  constructor() { }

  list:list[]=[{name:'Akhil',size:1,id:1},{name:'queue',size:2,id:2}]

  ngOnInit() {

  }

}
