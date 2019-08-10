import { list } from './queuelist/list';
import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient }    from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class QueueService {

  constructor(private http:HttpClient) { }

  // getQueue():Observable<any[]>{
  //   return this.http.get<list[]>("http://localhost:8080");
  // }
}
