import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { environment } from './environments/environment';
import {AdminHomeModule} from "./app/admin-home.module";

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AdminHomeModule)
  .catch(err => console.error(err));
