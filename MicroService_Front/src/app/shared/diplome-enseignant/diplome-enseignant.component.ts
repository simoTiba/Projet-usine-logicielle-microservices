import { Component, OnInit } from '@angular/core';
import { ProxyPortailService } from 'app/services/proxy-portail.service';

@Component({
  selector: 'app-diplome-enseignant',
  templateUrl: './diplome-enseignant.component.html',
  styleUrls: ['./diplome-enseignant.component.css']
})
export class DiplomeEnseignantComponent implements OnInit {
  diplomeByEns:any;
  constructor(private _proxy:ProxyPortailService) { }

  ngOnInit() {
      this.diplomeByEns=this._proxy.getDiplomeByEns(1).subscribe(
        data=>{
            this.diplomeByEns=data;
        },err=>{
              console.log(err);
            }
          );
  }


}
