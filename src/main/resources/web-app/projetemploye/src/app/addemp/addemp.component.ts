import { Component, OnInit } from '@angular/core';
import { EmpserviceService } from '../service/empservice.service';
@Component({
  selector: 'app-addemp',
  templateUrl: './addemp.component.html',
  styleUrls: ['./addemp.component.css']
})
export class AddempComponent implements OnInit {
  employe={
    first_name:'',
    last_name:'',
    age:''
  }
  submitted=false;
  constructor(private empservice:EmpserviceService) { }

  ngOnInit(): void {
  }
  saveemp() :void{
    const data = {
      fist_name: this.employe.first_name,
      last_name:this.employe.last_name,
      age:this.employe.age
    };
    this.empservice.create(data)
      .subscribe(
        response=>{
          console.log(response);
          this.submitted=true;
        },
        error=>{
          console.log(error);
        }
      )
  }
  newemp():void{
    this.submitted=false;
    this.employe={
      first_name:'',
      last_name:'',
      age:''
    };
  }

}
