import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AnswerService } from './answer.service';
import { TakeQuizComponent } from './take-quiz/take-quiz.component';
import { ReviewQuizComponent } from './review-quiz/review-quiz.component';
import { QuizResultComponent } from './quiz-result/quiz-result.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    TakeQuizComponent,
    ReviewQuizComponent,
    QuizResultComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule

  ],
  providers: [AnswerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
