import { FormService } from 'projects/admin-component/src/lib/form/form.service';
import { LoginService } from './login.service';
import { ReactiveFormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { LoginRoutingModule } from './login-routing.module';
import { LoginComponent } from './login.component';

import { HttpClientModule } from '@angular/common/http';
import { FormModule } from 'projects/admin-component/src/lib/form/form.module';
import { CommandButtonModule } from 'projects/admin-component/src/lib/button/button.module';
import { InputTextModule } from 'projects/admin-component/src/lib/input-text/input-text.module';

@NgModule({
  declarations: [LoginComponent],
  imports: [
    CommonModule,
    
    HttpClientModule,
    ReactiveFormsModule,
    LoginRoutingModule,
    
    FormModule, 
    CommandButtonModule,
    InputTextModule
  ],
  providers: [
    FormService,
    LoginService
  ]
})
export class LoginModule { }
