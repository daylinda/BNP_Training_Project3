import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TakeQuizComponent } from './take-quiz/take-quiz.component';
import { ReviewQuizComponent } from './review-quiz/review-quiz.component';
import { QuizResultComponent } from './quiz-result/quiz-result.component';


const routes: Routes = [
  {path:'takeQuiz',component:TakeQuizComponent},
  {path:'quizReview',component:ReviewQuizComponent},
  {path:'quizResults',component:QuizResultComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
