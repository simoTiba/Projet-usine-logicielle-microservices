import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpModule } from '@angular/http'; 

import { AppComponent } from './app.component';
import { AppRoutes } from './app.routing';
import { SidebarModule } from './sidebar/sidebar.module';
import { FooterModule } from './shared/footer/footer.module';
import { NavbarModule} from './shared/navbar/navbar.module';
import { NguiMapModule} from '@ngui/map';
import {FormsModule} from '@angular/forms';

import { DashboardComponent }   from './dashboard/dashboard.component';
import { UserComponent }   from './user/user.component';
import { FormationComponent } from './formation/formation.component';
import { UniteEnsComponent } from './entity/unite-ens/unite-ens.component';
import { ProxyPortailService } from './services/proxy-portail.service';
import { ServiceComponent } from './service/service.component';
import { EnseignantService } from './services/enseignant.service';
import { EnsComponent } from './entity/ens/ens.component';
import { EnseignantsComponent } from './enseignants/enseignants.component';
import { QuotaEnseignantComponent } from './shared/quota-enseignant/quota-enseignant.component';
import { DiplomeEnseignantComponent } from './shared/diplome-enseignant/diplome-enseignant.component';
import { ServiceService } from './services/service.service';
import { DiplomeService } from './services/diplome.service';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    UserComponent,
    FormationComponent,
    UniteEnsComponent,
    ServiceComponent,
    EnsComponent,
    EnseignantsComponent,
    QuotaEnseignantComponent,
    DiplomeEnseignantComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(AppRoutes),
    SidebarModule,
    NavbarModule,
    FooterModule,
    HttpModule,
    FormsModule
  ],
  providers: [ProxyPortailService, EnseignantService, ServiceService, DiplomeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
