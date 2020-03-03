import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../models/User';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class UserService {

  // TODO need to come in and invoke user service created by microService.
  constructor(private http: HttpClient) { }

  getUser(id) {
    return this.http.get<User[]>(`/userService/user/${id}`);
  }

  register(user: User) {
    return this.http.put(`/userService/user`, user);
  }

  delete(id: number) {
    return this.http.delete(`/userService/user/${id}`);
  }
}
