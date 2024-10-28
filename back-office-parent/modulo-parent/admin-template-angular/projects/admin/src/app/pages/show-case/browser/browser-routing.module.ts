import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: 'toastr', loadChildren: () => import('./toastr/toastr.module').then(m => m.ToastrModule)},
  { path: 'uploadfile', loadChildren: () => import('./upload-file/upload-file.module').then(m => m.UploadFileModule) }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class BrowserRoutingModule { }
