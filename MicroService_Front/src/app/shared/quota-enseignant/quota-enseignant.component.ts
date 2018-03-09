import { Component, OnInit } from '@angular/core';
import { ProxyPortailService } from 'app/services/proxy-portail.service';

@Component({
  selector: 'app-quota-enseignant',
  templateUrl: './quota-enseignant.component.html',
  styleUrls: ['./quota-enseignant.component.css']
})
export class QuotaEnseignantComponent implements OnInit {

  constructor(private _proxy:ProxyPortailService) { }
  rows:any=[];
  ngOnInit() {
  this.rows=this._proxy.getQuotasForEns(1);
  console.log(this.rows);
  }

}
