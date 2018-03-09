import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DiplomeEnseignantComponent } from './diplome-enseignant.component';

describe('DiplomeEnseignantComponent', () => {
  let component: DiplomeEnseignantComponent;
  let fixture: ComponentFixture<DiplomeEnseignantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DiplomeEnseignantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DiplomeEnseignantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
