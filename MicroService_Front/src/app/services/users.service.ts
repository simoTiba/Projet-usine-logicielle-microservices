import { Injectable } from '@angular/core';

@Injectable()
export class UsersService {

  DataHeader={ 
    id : "ID",
    titre:"Titre",
    respo:"Resposnable",
    spe:"Spécialité"
  };

  DataRow=[
    {id:"1",titre:"Licence" ,respo:"Dupont",spe:"informatique"},
    {id:"2",titre:"Master" ,respo:"Dupont",spe:"informatique"},
    {id:"3",titre:"Bac+1" ,respo:"Dupont",spe:"informatique"},
    {id:"4",titre:"DUT" ,respo:"Dupont",spe:"informatique"},
    {id:"5",titre:"BTS" ,respo:"Dupont",spe:"informatique"}
  
];


  getData(){
    return this.DataRow;
  }
  getHeader(){
    return this.DataHeader;
  }
  constructor() { }

}
