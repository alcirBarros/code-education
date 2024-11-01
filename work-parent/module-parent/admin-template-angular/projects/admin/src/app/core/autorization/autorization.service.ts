import { Autorization } from './autorization.model';
import { BehaviorSubject } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AutorizationService {
  private currentAutorizationSubject: BehaviorSubject<Autorization>;

  constructor() { 
    const autorization = this.getStorage();
    this.currentAutorizationSubject = new BehaviorSubject<Autorization>(autorization);
  }

  setAutorizationItem(autorization: Autorization) {
    const storage = this.setStorage(autorization);
    this.currentAutorizationSubject.next(autorization);
    console.log(storage);
  }

  private setStorage(autorization: Autorization) : string{
    const json = JSON.stringify(autorization);
    localStorage.setItem('currentAutorization', json);
    return json;
  }

  private getStorage() : Autorization{
    const parse = JSON.parse(localStorage.getItem('currentAutorization'));
    return parse;
  }
}