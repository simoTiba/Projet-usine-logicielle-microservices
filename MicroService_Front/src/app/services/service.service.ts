import { Injectable } from '@angular/core';
import {Http} from '@angular/http';
import 'rxjs/add/operator/map';
@Injectable()
export class ServiceService {

  constructor(private _http:Http) { }
  allservice:any;

  getAllservice(){

    this._http.get('http://localhost:9999/services').map(resp=>resp.json()).subscribe(
      data=>{
          this.allservice=data;
          console.log(this.allservice);
      },err=>{
            console.log(err);
          });
          return this.allservice;
  }

  getServiceByEnseignant(idEnseignant){
    return this._http.get('http://localhost:1111/serviceByEnseignant/'+idEnseignant).map(resp=>resp.json());
  }

  getServiceByDiplome(idUE){

  }

  getServiceById(idService){

  }

}
