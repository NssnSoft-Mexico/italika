import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({ providedIn: 'root' })
export class AuthService {
  private url = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  async getAllMoto(): Promise<any> {
    return await this.http.get<any>(`${this.url}/api/inventario`).toPromise().then(result => {
      const data = result.length ? result : false;
      return data;
    });
  }

  async setInfoSale(costo_total:number, monto_enganche:number, costo_con_iva:number, costo_sin_iva:number, tasa_credito:number): Promise<any> {
    const queryParams: any = {
      fecha_cotizacion: new Date(),
      costo_total: costo_total,
      monto_enganche: monto_enganche,
      costo_con_iva: costo_con_iva,
      costo_sin_iva: costo_sin_iva,
      tasa_credito: tasa_credito
    }
    return await this.http.post<any>(`${this.url}/setInfoSale`, queryParams).toPromise();
  }

}
