import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GiphyDisplayComponent } from './component/giphy-display/giphy-display.component';
import { AboutComponent } from './component/pages/about/about.component';
import { ProfileComponent } from './component/pages/profile/profile.component';


const routes: Routes = [
  {path: '', component: GiphyDisplayComponent},
  {path: 'about', component: AboutComponent},
  {path: 'profile', component: ProfileComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
