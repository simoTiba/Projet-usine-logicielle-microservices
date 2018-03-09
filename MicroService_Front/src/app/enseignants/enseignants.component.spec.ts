import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EnseignantsComponent } from './enseignants.component';

describe('EnseignantsComponent', () => {
  let component: EnseignantsComponent;
  let fixture: ComponentFixture<EnseignantsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EnseignantsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EnseignantsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
