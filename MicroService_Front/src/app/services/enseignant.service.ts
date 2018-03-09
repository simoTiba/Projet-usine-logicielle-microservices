import { Injectable } from '@angular/core';
import { Http } from '@angular/http';

@Injectable()
export class EnseignantService {

  constructor(private _http:Http) { }

  getAllEnseignant(){
    return this._http.get('http://localhost:9999/enseignants').map(resp=>resp.json());
  }

  getEnseignantById(idEns){
    return this._http.get('http://localhost:9999/enseignantProxy/'+idEns).map(resp=>resp.json());

  }

  addEnseignant(v){

  }

  deleteEnseignant(idEns){

  }

  updateEnseignant(v){

  }


}
