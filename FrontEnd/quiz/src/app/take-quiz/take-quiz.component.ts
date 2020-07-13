import { Component, OnInit } from '@angular/core';
import { UserAnswers } from '../user-answers';
import { AnswerService } from '../answer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-take-quiz',
  templateUrl: './take-quiz.component.html',
  styleUrls: ['./take-quiz.component.css']
})
export class TakeQuizComponent implements OnInit {
  private userAnswer:UserAnswers;

  constructor(private service:AnswerService,private router=Router) { 
    this.userAnswer=new UserAnswers();
  }

  public takeQuiz(){

  }

  ngOnInit() {
  }

}
