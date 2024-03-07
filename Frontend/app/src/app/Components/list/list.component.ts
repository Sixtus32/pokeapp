import { Component } from '@angular/core';
import { ServiceService } from '../../Service/service.service';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrl: './list.component.css'
})
export class ListComponent {
  constructor(public ws : ServiceService){
    
  }
}
