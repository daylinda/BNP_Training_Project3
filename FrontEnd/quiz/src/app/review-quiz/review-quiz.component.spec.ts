import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReviewQuizComponent } from './review-quiz.component';

describe('ReviewQuizComponent', () => {
  let component: ReviewQuizComponent;
  let fixture: ComponentFixture<ReviewQuizComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReviewQuizComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReviewQuizComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
