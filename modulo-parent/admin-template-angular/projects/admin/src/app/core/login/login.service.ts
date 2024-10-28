import { Constants } from './../../constants';
import { AutorizationService } from './../autorization/autorization.service';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { map } from 'rxjs/operators';

import {Router} from '@angular/router';

@Injectable()
export class LoginService {

  constructor(private autorizationService: AutorizationService, private http: HttpClient, private router: Router) {
  }

  login(username: string, password: string): Observable<any> {
    const headers = { 'Content-Type': 'application/json', 'Access-Control-Allow-Origin': '*' };
    const options = { headers };
    const body = {username, password};

    return this.http.post(Constants.LOGIN, body, options).pipe(map(autorization  => {
      this.autorizationService.setAutorizationItem(autorization);
      return autorization;
    }));
  }

  logout() {
    this.autorizationService.setAutorizationItem(null);
    this.router.navigate(['/'], );
  }
}