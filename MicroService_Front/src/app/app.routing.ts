import { Routes } from '@angular/router';

import { DashboardComponent }   from './dashboard/dashboard.component';
import { UserComponent }   from './user/user.component';
import { EnseignantsComponent } from 'app/enseignants/enseignants.component';

import { FormationComponent } from 'app/formation/formation.component';
import { UniteEnsComponent } from 'app/entity/unite-ens/unite-ens.component';
import { ServiceComponent } from 'app/service/service.component';
import { EnsComponent } from 'app/entity/ens/ens.component';

export const AppRoutes: Routes = [
    {
        path: '',
        redirectTo: 'dashboard',
        pathMatch: 'full',
    },
    {
        path: 'dashboard',
        component: DashboardComponent
    },
    {
        path: 'profil',
        component: UserComponent
    },
    {
        path: 'diplomes',
        component: FormationComponent
    },
    {
        path: 'enseignant',
        component: EnseignantsComponent
    },
    {
        path: 'services',
        component: ServiceComponent
    },

    {
        path: 'ue/:id',
        component: UniteEnsComponent
    },
    {
        path:'ens/:id',
        component: EnsComponent
    }
]
