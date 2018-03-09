import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UniteEnsComponent } from './unite-ens.component';

describe('UniteEnsComponent', () => {
  let component: UniteEnsComponent;
  let fixture: ComponentFixture<UniteEnsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UniteEnsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UniteEnsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
