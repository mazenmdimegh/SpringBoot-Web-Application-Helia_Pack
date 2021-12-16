import { Component, OnInit } from '@angular/core';
import { EmpserviceService } from '../service/empservice.service';

@Component({
  selector: 'app-emplist',
  templateUrl: './emplist.component.html',
  styleUrls: ['./emplist.component.css']
})
export class EmplistComponent implements OnInit {
  employe:any;
  currentemp= null;
  currentindex=-1;
  first_name='';


  constructor(private empservices :EmpserviceService) { }

  ngOnInit(): void {
  }
  retrieveemploye():void{
    this.empservices.getAll()
    .subscribe(
      data => {
        this.employe = data;
        console.log(data);
      },
      error=>{
        console.log(error);
      });
  }
  refreshlist() : void{
    this.retrieveemploye();
    this.currentemp=null;
    this.currentindex = -1;
  }

}
