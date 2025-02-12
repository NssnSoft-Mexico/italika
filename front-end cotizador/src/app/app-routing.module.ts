import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { UsuarioComponent } from './pages/usuario/usuario.component';
import { ResumenCompraComponent } from './pages/resumen-compra/resumen-compra.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'descripcion', component: UsuarioComponent },
  { path: 'resumen_compra', component: ResumenCompraComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
