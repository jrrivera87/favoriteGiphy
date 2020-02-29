import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GiphyItemComponent } from './giphy-item.component';

describe('GiphyItemComponent', () => {
  let component: GiphyItemComponent;
  let fixture: ComponentFixture<GiphyItemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GiphyItemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GiphyItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
