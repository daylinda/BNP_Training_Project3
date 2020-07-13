import { Component, OnInit } from '@angular/core';
import { UserAnswers } from '../user-answers';
import { AnswerService } from '../answer.service';
import { Router } from '@angular/router';
import { UserAnswerHTMLModel } from '../user-answer-htmlmodel';
import { AnswerResult } from '../answer-result';
import { AnswerResponse } from '../answer-response';

@Component({
  selector: 'app-take-quiz',
  templateUrl: './take-quiz.component.html',
  styleUrls: ['./take-quiz.component.css']
})
export class TakeQuizComponent implements OnInit {
  private userAnswerHtmlModel:UserAnswerHTMLModel;
  private answerResult: AnswerResult;
  

  constructor(private service:AnswerService, private router:Router) { 
    this.userAnswerHtmlModel=new UserAnswerHTMLModel();
    this.answerResult = new AnswerResult();
    this.answerResult.result = 0;
    this.answerResult.answerResponses = null;
  }

  public takeQuiz(){

    this.answerResult.userName = this.userAnswerHtmlModel.userName;
   this.service.takeQuiz(this.userAnswerHtmlModel).subscribe(res=>this.publishReview(res));


  }

  public publishReview(ans:AnswerResponse[])
  {
    this.answerResult.result =0;
    for (let res of ans)
    {
      
      if(res.userAnswer == res.correctAnswer)
      {
        this.answerResult.result += 1;
      }
    }

    this.answerResult.answerResponses = ans;
  }

  public showReview(){
    var s = document.getElementById("Review");
    s.style.display="block";
    var p = document.getElementById("Result");
    p.style.display="block";   
  }  

  public validateForm() {
    var x = document.forms["myForm"]["userName"].value;
    if (x == "") {
      alert("Name must be filled out");
      return false;
    }
  }



  ngOnInit() {
  }

}
