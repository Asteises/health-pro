import {NgModule} from "@angular/core";
import {RouterModule, Routes} from '@angular/router';
import {RecipeComponent} from "./recipe/recipe-component/recipe.component";

export const routes: Routes = [
  {path: 'recipes', component: RecipeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
