import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { NgxToastrRoutingModule } from './ngx-toastr-routing.module';
import { NgxToastrComponent } from './ngx-toastr.component';


@NgModule({
  declarations: [NgxToastrComponent],
  imports: [
    CommonModule,
    NgxToastrRoutingModule
  ]
})
export class NgxToastrModule { }
