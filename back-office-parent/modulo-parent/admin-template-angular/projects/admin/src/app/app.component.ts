import { Component, OnInit } from '@angular/core';
import { LayoutService } from 'projects/admin-template/src/lib/layout/layout.module';
import { KeycloakService } from 'keycloak-angular';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  public customLayout: boolean;

  constructor(
    private keycloakService: KeycloakService,
    private layoutService: LayoutService
  ) { }

  ngOnInit() {
    this.layoutService.isCustomLayout.subscribe((value: boolean) => {
      this.customLayout = value;
    });
  }


  logout() {
    this.keycloakService.logout();
  }
}
