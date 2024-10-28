import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { WrapperModule } from 'projects/admin-template/src/lib/layout/wrapper/wrapper.module';
import { ContentModule } from 'projects/admin-template/src/lib/layout/content/content.module';
import { FooterModule } from 'projects/admin-template/src/lib/layout/footer/footer.module';
import { HeaderModule } from 'projects/admin-template/src/lib/layout/header/header.module';
import { SidebarLeftModule } from 'projects/admin-template/src/lib/layout/sidebar-left/sidebar-left.module';
import { SidebarRightModule } from 'projects/admin-template/src/lib/layout/sidebar-right/sidebar-right.module';
import { TemplateComponent } from './template.component';
import { RouterModule } from '@angular/router';


@NgModule({
  declarations: [TemplateComponent],
  imports: [
    CommonModule,
    RouterModule,
    ContentModule, FooterModule, HeaderModule, SidebarLeftModule, SidebarRightModule, WrapperModule
  ]
})
export class TemplateModule { }
