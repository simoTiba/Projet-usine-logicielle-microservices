import { TestBed, inject } from '@angular/core/testing';

import { DiplomeService } from './diplome.service';

describe('DiplomeService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [DiplomeService]
    });
  });

  it('should be created', inject([DiplomeService], (service: DiplomeService) => {
    expect(service).toBeTruthy();
  }));
});
