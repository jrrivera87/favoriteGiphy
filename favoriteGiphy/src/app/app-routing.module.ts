import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GiphyDisplayComponent } from './component/giphy-display/giphy-display.component';
import { AboutComponent } from './component/pages/about/about.component';
import { ProfileComponent } from './component/pages/profile/profile.component';
import { LoginComponent } from './component/pages/login/login.component';
import { RegisterComponent } from './component/pages/register/register.component';


const routes: Routes = [
  {path: '', component: GiphyDisplayComponent},
  {path: 'about', component: AboutComponent},
  {path: 'profile', component: ProfileComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},

  // Anything else will redirect to home page.
  {path: '**', redirectTo: ''}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
