import { FormService } from 'projects/admin-component/src/lib/form/form.service';
import { Component, Output, EventEmitter, Input } from "@angular/core";

@Component({
  selector: "app-button",
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css'],
})
export class ButtonComponent {

  @Input()
  processingLabel = "Processing...";

  @Input()
  disabled: boolean = false;

  @Input()
  immedated: boolean | null;

  @Input()
  style: string | null;

  @Output()
  outputClick = new EventEmitter();

  constructor(
    protected formService: FormService
  ) { }

  onClick(event) {
    console.log("onClick");
    this.outputClick.emit({ "event": "click" });
  }

  get submitted() {
    return this.formService.form.submitted;
  }
}