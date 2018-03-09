import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { QuotaEnseignantComponent } from './quota-enseignant.component';

describe('QuotaEnseignantComponent', () => {
  let component: QuotaEnseignantComponent;
  let fixture: ComponentFixture<QuotaEnseignantComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ QuotaEnseignantComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(QuotaEnseignantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
