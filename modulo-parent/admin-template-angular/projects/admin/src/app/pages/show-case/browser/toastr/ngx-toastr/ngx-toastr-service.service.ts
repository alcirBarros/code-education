import { Injectable } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { take } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class NgxToastrServiceService {

  constructor(private toastrService: ToastrService) {
  }
  success(text: string, subText?: string, toastr?: () => void) {
    this.toastrService.success(text, null, { timeOut: 5000 }).onTap.pipe(take(1))
    .subscribe(() => toastr());
  }


  error(text: string) {
    this.toastrService.error(text);
  }

  info(text: string) {
    this.toastrService.info(text);
  }

  warning(text: string) {
    this.toastrService.warning(text);
  }
}
