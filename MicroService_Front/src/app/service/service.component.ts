import { Component, OnInit } from '@angular/core';
import {ProxyPortailService} from '../services/proxy-portail.service';
import { forEach } from '@angular/router/src/utils/collection';
import { ServiceService } from 'app/services/service.service';
@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent implements OnInit {
  allservice :any;
  v:number;
  rows:any=[];

  constructor(private proxy:ProxyPortailService,private  _services:ServiceService) { }

  ngOnInit() {
   this.rows=this.proxy.getQuotasForAllEns();
  }
  }


