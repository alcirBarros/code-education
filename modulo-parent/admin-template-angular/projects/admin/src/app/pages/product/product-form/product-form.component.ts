import { Component, OnInit } from '@angular/core';

@Component({
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.scss']
})
export class ProductFormComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  cancelar(){
  //  this.form.reset();
  }
}
