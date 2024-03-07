import { Component } from '@angular/core';
import { ServiceService } from './Service/service.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Frontend';
  constructor(public ws : ServiceService){
    
  }

  register(f : NgForm){
    this.ws.insertCoach(f.value.username)
  }
}
