import { AuthGuard } from './core/auth/auth.guard';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TemplateComponent } from './template/template.component';
import { routes as routes_ } from './pages/pages-routing.module';

const routes: Routes = [
  { path: '', component: TemplateComponent, children: routes_},
  { path: 'login', loadChildren: () => import('./core/core.module').then(m => m.CoreModule)},
  { path: '**', redirectTo: ''}
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
