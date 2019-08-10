import { list } from './queuelist/list';
import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient, HttpHeaders }    from '@angular/common/http'
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class QueueService {

  constructor(private http:HttpClient) { }

  // getQueue():Observable<any[]>{
  //   return this.http.get<list[]>("http://localhost:8080");
  // }


  addQueue(name,size):Observable<any>{
    let body = '{ "queueName" : "'+name+'","size":'+size + ' }';
    let headers =  {headers: new  HttpHeaders({ 'Content-Type': 'application/json'})};
    return this.http.post('http://localhost:8080/queue/addqueue', body, headers ).pipe(map((response: any) => response.json()));

  }
}
