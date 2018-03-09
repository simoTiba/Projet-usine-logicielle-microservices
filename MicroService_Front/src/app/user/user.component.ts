import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'user-cmp',
    moduleId: module.id,
    templateUrl: 'user.component.html'
})

export class UserComponent implements OnInit{
    ngOnInit(){
    }

    userInfo={
        nom:"idouhammou",
        prenom:"abdel",
        motpasse:"motdepasse",
        email:"idouhammou.a@gmail.com",
        path:"photo.jpg",
        statut:"Professeur",
        adresse:"34 Avenue des états unis 78000 Versailles",
        about:"blabla blabla blabla blabla blabla blabla blabla blablablabla blabla "
    };
}
