import { Component, OnInit ,Input} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import { Console } from '@angular/core/src/console';

@Component({
  selector: 'app-unite-ens',
  templateUrl: './unite-ens.component.html',
  styleUrls: ['./unite-ens.component.css']
})
export class UniteEnsComponent implements OnInit {
@Input() id:String;
menuItem:any[];
  constructor(route: ActivatedRoute) { 
    this.id = route.snapshot.params['id']; // 3
  }
  ngOnInit() {
    console.log("Id de ue est "+this.id);
  }

}
