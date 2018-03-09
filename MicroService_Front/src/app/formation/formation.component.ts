import { Component, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';
import {ProxyPortailService} from '../services/proxy-portail.service';
import { NgForm } from '@angular/forms';


@Component({
    selector: 'formation-cmp',
    moduleId: module.id,
    templateUrl: 'formation.component.html',
    styleUrls: ['./formation.component.css']

})


export class FormationComponent implements OnInit{
    public allDiplome:any[] = [];
    diplome={
        "idDiplome": "",
        "semestre": "",
        "volumehoraire": "",
        "codeUe": "",
        "ueId": "",
        "idEnseignant": 0
    };
   
    constructor(private proxy:ProxyPortailService) {

     }

  
    ngOnInit(){
    
        this.getAllDiplome();
    }


    getAllDiplome(){
        this.proxy.allDiplome().subscribe(
            data=>{
                this.allDiplome=data;
                console.log(data);
            },err=>{
                  console.log(err);
                });
    }

    onAddDiplome(diplomeForm:NgForm){
        this.diplome.codeUe=diplomeForm.controls['codeue'].value;
        this.diplome.idDiplome=diplomeForm.controls['maquette'].value;
        this.diplome.idEnseignant=(diplomeForm.controls['respo'].value);
        this.diplome.semestre=diplomeForm.controls['maquette'].value;
        this.diplome.ueId=diplomeForm.controls['titre'].value;
        this.diplome.volumehoraire=diplomeForm.controls['vhoraire'].value;
        console.log(JSON.stringify(this.diplome));
       this.proxy.addDiplome((this.diplome)).subscribe(
        res => {
          console.log(res);
        },
        err => {
          console.log(err);
        }
      );
    }
}
