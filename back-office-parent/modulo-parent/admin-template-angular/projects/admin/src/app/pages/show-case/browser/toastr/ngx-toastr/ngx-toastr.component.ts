import { NgxToastrServiceService } from './ngx-toastr-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  templateUrl: './ngx-toastr.component.html',
  styleUrls: ['./ngx-toastr.component.scss']
})
export class NgxToastrComponent implements OnInit {

  constructor(private ngxToastrServiceService: NgxToastrServiceService) {}

  ngOnInit(): void {
    this.ngxToastrServiceService.success('Click here!', "Sub", this.toasterClickedHandler);
  }

  toasterClickedHandler() {
    console.log('Toastr clicked');
  }
}
