import { Injectable } from '@angular/core';
import { UserAnswers } from './user-answers';
import { AnswerResponse } from './answer-response';
import { HttpClient } from '@angular/common/http';
import { AnswerResult } from './answer-result';

@Injectable({
  providedIn: 'root'
})
export class AnswerService {
  private url:string;

  constructor(private http:HttpClient) {
    this.url="http://localhost:9100/"
   }

   public takeQuiz(userAnswer:UserAnswers){
    return this.http.post<AnswerResult>(this.url+'/answers',userAnswer);

   }
   
}
