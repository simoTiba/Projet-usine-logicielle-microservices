import { Component, OnInit } from '@angular/core';
import * as Chartist from 'chartist';
import { ProxyPortailService } from 'app/services/proxy-portail.service';
import { EnseignantService } from 'app/services/enseignant.service';

declare var $:any;

@Component({
    selector: 'dashboard-cmp',
    moduleId: module.id,
    templateUrl: 'dashboard.component.html'
})

export class DashboardComponent implements OnInit{
    constructor(private _proxy:ProxyPortailService,private _enseignant:EnseignantService) { }
    public enseignant:number;
    public uniteEnseignement:number;
    public heurefaites:number;
    public stat:any=[];   


    ngOnInit(){
        
       
}



}