import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { AuthService } from 'src/app/services/auth.service';

@Component({
  selector: 'app-usuario',
  templateUrl: './usuario.component.html',
  styleUrls: ['./usuario.component.css']
})

export class UsuarioComponent implements OnInit {
  item:any;
  items:any;
  checkoutForm:any;

  constructor(private formBuilder: FormBuilder, private authService: AuthService) {
    let local = `${localStorage.getItem("moto")}`;
    this.item = JSON.parse(local)
    console.log('DATA: ', this.item);
    this.checkoutForm = this.formBuilder.group({
      costo_total: 0,
      monto_enganche: this.item.precio/10,
      costo_con_iva: this.item.precio*1.16,
      costo_sin_iva: this.item.precio,
      tasa_credito: this.item.precio*1.125,
    });
  }

  ngOnInit() {
  }

  onSubmit(datos: any) {
    console.log('datos: ', datos);
    this.items = this.authService.setInfoSale(datos.costo_total, datos.monto_enganche, datos.costo_con_iva, datos.costo_sin_iva, datos.tasa_credito);
    //this.checkoutForm.reset();

  }

}
