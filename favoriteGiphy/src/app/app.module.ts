import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GiphyDisplayComponent } from './component/giphy-display/giphy-display.component';
import { GiphyItemComponent } from './component/giphy-item/giphy-item.component';
import { HeaderComponent } from './component/layout/header/header.component';
import { AboutComponent } from './component/pages/about/about.component';
import { ProfileComponent } from './component/pages/profile/profile.component';

@NgModule({
  declarations: [
    AppComponent,
    GiphyDisplayComponent,
    GiphyItemComponent,
    HeaderComponent,
    AboutComponent,
    ProfileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
