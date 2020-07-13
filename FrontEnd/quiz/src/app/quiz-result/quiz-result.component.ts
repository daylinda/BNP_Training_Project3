import { Component, OnInit } from '@angular/core';
import { QuizResult } from '../quiz-result';
import { AnswerService } from '../answer.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-quiz-result',
  templateUrl: './quiz-result.component.html',
  styleUrls: ['./quiz-result.component.css']
})
export class QuizResultComponent implements OnInit {
  private quizResults:QuizResult[];

  constructor(private service:AnswerService, private router:Router) 
  {
      this.quizResults = null;
   }

  ngOnInit() {

    this.service.quizResults().subscribe(res=>this.quizResults=res);
    
  }

}
