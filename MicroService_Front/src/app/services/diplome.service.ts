import { Injectable } from '@angular/core';
import {Http} from '@angular/http';

@Injectable()
export class DiplomeService {

  constructor(private _http:Http) { 

  }



  getAlldiplome(){
    return this._http.get("http://localhost:9999/diplomes").map(resp=>resp.json());

  }

  getDiplomeByEns(idEns){
          return  this._http.get('http://localhost:3333/diplomeByidEnseignant/'+idEns).map(resp=>resp.json());  
  }

  getDiplomeById(idDip){
    return this._http.get('http://localhost:9999/diplomesProxy/'+idDip).map(resp=>resp.json()); 
  }

  updateDiplome(v){

  }

  addDiplome(v){

  }

}
