import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TakeQuizComponent } from './take-quiz/take-quiz.component';
import { QuizReviewComponent } from './quiz-review/quiz-review.component';
import { QuizResultsComponent } from './quiz-results/quiz-results.component';


const routes: Routes = [
  {path:'takeQuiz',component:TakeQuizComponent},
  {path:'quizReview',component:QuizReviewComponent},
  {path:'quizResults',component:QuizResultsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
