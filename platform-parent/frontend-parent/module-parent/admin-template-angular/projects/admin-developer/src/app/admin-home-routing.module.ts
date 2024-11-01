import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeOneComponent } from './components/pages/home-one/home-one.component';
import { HomeTwoComponent } from './components/pages/home-two/home-two.component';
import { HomeThreeComponent } from './components/pages/home-three/home-three.component';
import { AboutComponent } from './components/pages/about/about.component';
import { ErrorComponent } from './components/pages/error/error.component';
import { FaqComponent } from './components/pages/faq/faq.component';
import { TermsConditionComponent } from './components/pages/terms-condition/terms-condition.component';
import { PrivacyPolicyComponent } from './components/pages/privacy-policy/privacy-policy.component';
import { LoginComponent } from './components/pages/login/login.component';
import { SignupComponent } from './components/pages/signup/signup.component';
import { TestimonialsComponent } from './components/pages/testimonials/testimonials.component';
import { DepartmentsComponent } from './components/pages/departments/departments.component';
import { AppointmentComponent } from './components/pages/appointment/appointment.component';
import { ComingSoonComponent } from './components/pages/coming-soon/coming-soon.component';
import { ServicesComponent } from './components/pages/services/services.component';
import { ServicesDetailsComponent } from './components/pages/services-details/services-details.component';
import { DoctorComponent } from './components/pages/doctor/doctor.component';
import { DoctorDetailsComponent } from './components/pages/doctor-details/doctor-details.component';
import { BlogComponent } from './components/pages/blog/blog.component';
import { BlogDetailsComponent } from './components/pages/blog-details/blog-details.component';
import { ContactComponent } from './components/pages/contact/contact.component';

const routes: Routes = [
    {path: '', component: HomeOneComponent},
    // {path: 'home-two', component: HomeTwoComponent},
    // {path: 'home-three', component: HomeThreeComponent},
    // {path: 'about', component: AboutComponent},
    // {path: 'appointment', component: AppointmentComponent},
    // {path: 'departments', component: DepartmentsComponent},
    // {path: 'testimonials', component: TestimonialsComponent},
    // {path: 'signup', component: SignupComponent},
    // {path: 'login', component: LoginComponent},
    // {path: 'privacy-policy', component: PrivacyPolicyComponent},
    // {path: 'terms-condition', component: TermsConditionComponent},
    // {path: 'faq', component: FaqComponent},
    // {path: 'error', component: ErrorComponent},
    // {path: 'coming-soon', component: ComingSoonComponent},
    // {path: 'services', component: ServicesComponent},
    // {path: 'services-details', component: ServicesDetailsComponent},
    // {path: 'doctor', component: DoctorComponent},
    // {path: 'doctor-details', component: DoctorDetailsComponent},
    // {path: 'blog', component: BlogComponent},
    // {path: 'blog-details', component: BlogDetailsComponent},
    // {path: 'contact', component: ContactComponent},
    // Here add new pages component

    {path: '**', component: HomeOneComponent} // This line will remain down from the whole pages component list
];

@NgModule({
    imports: [RouterModule.forRoot(routes, { useHash: true })],
    exports: [RouterModule]
})
export class AdminHomeRoutingModule { }
