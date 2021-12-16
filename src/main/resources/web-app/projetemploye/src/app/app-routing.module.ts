import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmplistComponent } from './emplist/emplist.component';
import { AddempComponent } from './addemp/addemp.component';

const routes: Routes = [
  {path:'',redirectTo:'emplye',pathMatch:'full'}
  {path:'employe',component:EmplistComponent}
  {path:'add',component: AddempComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
