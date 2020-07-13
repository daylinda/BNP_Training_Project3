import { Injectable } from '@angular/core';
import { AnswerResult } from './answer-result';

@Injectable({
  providedIn: 'root'
})
export class AnswerService {

  

  constructor() { }

  public takeQuiz(){
    return this.http.post<AnswerResult>(this.url,userAnswer);
  }
}
