import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
    { path: 'ngxtoastr', loadChildren: () => import('./ngx-toastr/ngx-toastr.module').then(m => m.NgxToastrModule) },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ToastrRoutingModule { }
