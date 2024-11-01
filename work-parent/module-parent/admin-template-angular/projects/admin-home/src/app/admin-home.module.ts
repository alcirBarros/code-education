import { NgModule } from '@angular/core';

import {AdminHomeRoutingModule} from './admin-home-routing.module';
import { AdminHomeComponent } from './admin-home.component';
import { PreloaderComponent } from './components/layouts/preloader/preloader.component';
import { FooterComponent } from './components/layouts/footer/footer.component';
import { NavbarComponent } from './components/layouts/navbar/navbar.component';
import { HomeOneComponent } from './components/pages/home-one/home-one.component';
import { HomeTwoComponent } from './components/pages/home-two/home-two.component';
import { HomeThreeComponent } from './components/pages/home-three/home-three.component';
import { AboutComponent } from './components/pages/about/about.component';
import { AppointmentComponent } from './components/pages/appointment/appointment.component';
import { DepartmentsComponent } from './components/pages/departments/departments.component';
import { TestimonialsComponent } from './components/pages/testimonials/testimonials.component';
import { SignupComponent } from './components/pages/signup/signup.component';
import { LoginComponent } from './components/pages/login/login.component';
import { PrivacyPolicyComponent } from './components/pages/privacy-policy/privacy-policy.component';
import { TermsConditionComponent } from './components/pages/terms-condition/terms-condition.component';
import { FaqComponent } from './components/pages/faq/faq.component';
import { ErrorComponent } from './components/pages/error/error.component';
import { ServicesComponent } from './components/pages/services/services.component';
import { ServicesDetailsComponent } from './components/pages/services-details/services-details.component';
import { DoctorDetailsComponent } from './components/pages/doctor-details/doctor-details.component';
import { DoctorComponent } from './components/pages/doctor/doctor.component';
import { BlogComponent } from './components/pages/blog/blog.component';
import { BlogDetailsComponent } from './components/pages/blog-details/blog-details.component';
import { ContactComponent } from './components/pages/contact/contact.component';
import { ComingSoonComponent } from './components/pages/coming-soon/coming-soon.component';
import {CommonModule} from "@angular/common";
import {BrowserModule} from "@angular/platform-browser";

@NgModule({
  declarations: [
    AdminHomeComponent,
    PreloaderComponent,
    FooterComponent,
    NavbarComponent,
    HomeOneComponent,
    HomeTwoComponent,
    HomeThreeComponent,
    AboutComponent,
    AppointmentComponent,
    DepartmentsComponent,
    TestimonialsComponent,
    SignupComponent,
    LoginComponent,
    PrivacyPolicyComponent,
    TermsConditionComponent,
    FaqComponent,
    ErrorComponent,
    ServicesComponent,
    ServicesDetailsComponent,
    DoctorDetailsComponent,
    DoctorComponent,
    BlogComponent,
    BlogDetailsComponent,
    ContactComponent,
    ComingSoonComponent
  ],
  imports: [
    BrowserModule,
    AdminHomeRoutingModule
  ],
  providers: [],
  bootstrap: [AdminHomeComponent]
})
export class AdminHomeModule { }
