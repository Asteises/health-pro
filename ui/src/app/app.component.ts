import { Component } from '@angular/core';
import {RouterLink, RouterOutlet} from '@angular/router';
import {RecipeComponent} from "./recipe/recipe-component/recipe.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterLink, RecipeComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ui';
}
