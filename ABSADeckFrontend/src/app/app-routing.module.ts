import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserHealthcheckComponent } from './user-healthcheck/user-healthcheck.component'


const routes: Routes = [
  { path: 'health', component: UserHealthcheckComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
