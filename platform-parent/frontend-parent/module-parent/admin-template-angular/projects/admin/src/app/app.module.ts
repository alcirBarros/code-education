import { adminLteConf } from './admin-lte.conf';
import { BrowserModule } from '@angular/platform-browser';
import { APP_INITIALIZER, NgModule } from '@angular/core';

import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LayoutModule } from 'projects/admin-template/src/lib/layout/layout.module';
import { DashboardModule } from './pages/dashboard/dashboard.module';
import { ProductModule } from './pages/product/product.module';
import { ShowCaseModule } from './pages/show-case/show-case.module';
import { TemplateModule } from './template/template.module';
import {AdminHomeModule} from "../../../admin-home/src/app/admin-home.module";

function initializeKeycloak(keycloak: KeycloakService) {
  return () =>
    keycloak.init({
      config: {
        url: 'http://localhost:8180/auth',
        realm: 'dxt.abarros',
        clientId: 'dxt.abarros-frontend',
      },
      bearerExcludedUrls: ['/assets', '/clients/public'],
    });
}

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,

    AdminHomeModule,

    TemplateModule,
    DashboardModule,
    ProductModule,
    ShowCaseModule,

    KeycloakAngularModule,
    LayoutModule.forRoot(adminLteConf)
  ],
  // providers: [
  //   {
  //     provide: APP_INITIALIZER,
  //     useFactory: initializeKeycloak,
  //     multi: true,
  //     deps: [KeycloakService],
  //   },
  // ],
  bootstrap: [AppComponent]
})
export class AppModule { }
