import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  items:any;
  
  constructor(private authService: AuthService, private router: Router ) {
  }

  ngOnInit() {
    this.traeDatos();
  }

  async traeDatos() {
    this.items = await this.authService.getAllMoto();
    console.log('DATOS: ', this.items);
  }

  onClick(data:any){
    //localStorage.removeItem('moto');
    localStorage.setItem('moto', JSON.stringify(data));
    this.router.navigate(['/descripcion']);
  }

}
