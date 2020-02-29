import { Component, OnInit } from '@angular/core';
import {GiphyService} from '../../services/giphy.service';

@Component({
  selector: 'app-giphy-display',
  templateUrl: './giphy-display.component.html',
  styleUrls: ['./giphy-display.component.css']
})
export class GiphyDisplayComponent implements OnInit {
  giphies: any;
  searchTerm: string;

  constructor(private giphyService: GiphyService) { }

  ngOnInit(): void {}

  /*
  Invoking the GIPHY service to search for requested GIPHYs and setting them to an Array to iterate over.
   */
  giphySearch() {
    this.giphyService.searchForGIPHY(this.searchTerm).subscribe(giphies => {
      this.giphies = giphies.data;
    });
  }
}
