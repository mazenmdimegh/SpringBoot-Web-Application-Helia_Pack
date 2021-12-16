import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { EmployeComponent } from './employe/employe.component';
import { AddEmpComponent } from './emp/add-emp/add-emp.component';
import { EmplistComponent } from './emplist/emplist.component';
import { AddempComponent } from './addemp/addemp.component';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    EmployeComponent,
    AddEmpComponent,
    EmplistComponent,
    AddempComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
