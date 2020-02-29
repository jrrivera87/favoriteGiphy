import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Giphys} from '../models/Giphys';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

@Injectable({
  providedIn: 'root'
})
export class GiphyService {
  // Main URL to use GIPHY API
  giphyURL = 'https://api.giphy.com/v1/gifs/search?api_key=b8yNtQV2MknUtvi3uHsXgQ0r4S0zt2qI&q=';
  // Limiting search to first 25 and enabling a G rating only.
  limitAndRating = '&limit=25&offset=0&rating=G&lang=en';

  constructor(private http: HttpClient) { }

  /*
   Calling GIPHY API and retrieving requested GIPHYs and returning the Giphys model to use.
   */
  searchForGIPHY(value: string): Observable<Giphys> {
    // Concatinating URL and adding the "value" of the input from search box.
    const url = this.giphyURL + value + this.limitAndRating;
    return this.http.get<Giphys>(`${this.giphyURL}${value}${this.limitAndRating}`, httpOptions);
  }
}
