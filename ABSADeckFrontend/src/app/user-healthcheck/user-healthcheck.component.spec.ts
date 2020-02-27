import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserHealthcheckComponent } from './user-healthcheck.component';

describe('UserHealthcheckComponent', () => {
  let component: UserHealthcheckComponent;
  let fixture: ComponentFixture<UserHealthcheckComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserHealthcheckComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserHealthcheckComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
