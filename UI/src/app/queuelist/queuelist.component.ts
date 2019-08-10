import { Component, OnInit, Input } from '@angular/core';
import { list } from './list';

@Component({
  selector: 'app-queuelist',
  templateUrl: './queuelist.component.html',
  styleUrls: ['./queuelist.component.css']
})
export class QueuelistComponent implements OnInit {

  @Input('list') list;

  constructor() { }

  ngOnInit() {

  }

}
