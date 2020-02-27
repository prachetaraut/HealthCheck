import { Injectable } from '@angular/core';
import { Health } from '../_models/health'
import { HttpHeaders } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { from, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HealthService {

  healthUrl: string;

  constructor(private http: HttpClient) {
    this.healthUrl = 'http://localhost:56506/health';
   }

   getAllHealth() : Observable<Health> {
     return this.http.get<Health>(this.healthUrl + '/findAll')
   }
}
