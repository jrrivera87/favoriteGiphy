import { Component, OnInit, Input } from '@angular/core';
import {Giphy} from '../../models/Giphy';

@Component({
  selector: 'app-giphy-item',
  templateUrl: './giphy-item.component.html',
  styleUrls: ['./giphy-item.component.css']
})
export class GiphyItemComponent implements OnInit {
  @Input() giphy: Giphy;

  constructor() { }

  ngOnInit(): void {
  }

}
