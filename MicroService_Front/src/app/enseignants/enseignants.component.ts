import { Component, OnInit } from '@angular/core';
import { ProxyPortailService } from 'app/services/proxy-portail.service';

@Component({
  selector: 'app-enseignants',
  templateUrl: './enseignants.component.html',
  styleUrls: ['./enseignants.component.css']
})
export class EnseignantsComponent implements OnInit {
  rows:any=[];
  constructor(private _proxy:ProxyPortailService) { }


  ngOnInit(){
 
   
 this.rows=this._proxy.getAllEnseignant();

  }
}