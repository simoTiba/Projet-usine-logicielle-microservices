import { Component, OnInit } from '@angular/core';

declare var $:any;

export interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}

export const ROUTES: RouteInfo[] = [
    { path: 'dashboard', title: 'Tableau de bord',  icon: 'ti-panel', class: '' },
    { path: 'diplomes', title: 'Diplômes',  icon:'ti-medall', class: '' },
    { path: 'enseignant', title: 'Enseignants',  icon:'ti-bookmark', class: '' },
    { path: 'services', title: 'Services',  icon:'ti-bar-chart', class: '' }
];

@Component({
    moduleId: module.id,
    selector: 'sidebar-cmp',
    templateUrl: 'sidebar.component.html',
})

export class SidebarComponent implements OnInit {
    public menuItems: any[];
    ngOnInit() {
        this.menuItems = ROUTES.filter(menuItem => menuItem);
    }
    isNotMobileMenu(){
        if($(window).width() > 991){
            return false;
        }
        return true;
    }

}
