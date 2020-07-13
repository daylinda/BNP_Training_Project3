import { Injectable } from '@angular/core';
import { UserAnswers } from './user-answers';
import { AnswerResponse } from './answer-response';
import { HttpClient } from '@angular/common/http';
import { AnswerResult } from './answer-result';
import { UserAnswerHTMLModel } from './user-answer-htmlmodel';
import { QuizResult } from './quiz-result';

@Injectable({
  providedIn: 'root'
})
export class AnswerService {
  private url:string;

  constructor(private http:HttpClient) {
    this.url="http://localhost:9100/"
   }

   public takeQuiz(userAnswerHtmlModel:UserAnswerHTMLModel){

    let userAnswer = new UserAnswers();

    userAnswer.userName = userAnswerHtmlModel.userName;

 
    userAnswer.userAnswersMap = {}
    userAnswer.userAnswersMap[1] = userAnswerHtmlModel.answer1;
    userAnswer.userAnswersMap[2] = userAnswerHtmlModel.answer2;
    userAnswer.userAnswersMap[3] = userAnswerHtmlModel.answer3;
    userAnswer.userAnswersMap[4] = userAnswerHtmlModel.answer4;
  
   return this.http.post<AnswerResponse[]>(this.url+'/answers', userAnswer);
     
 

   }

   public quizResults()
   {
     return this.http.get<QuizResult[]>(this.url+'/quizresults' );
   }

   
}
