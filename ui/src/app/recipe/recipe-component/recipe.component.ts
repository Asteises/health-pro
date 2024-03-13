import {NgForOf} from "@angular/common";
import {Component, OnInit} from '@angular/core';
import {firstValueFrom} from "rxjs";
import {Recipe} from "../interfaces/recipe";
import {RecipeService} from "../service/recipe.service";

@Component({
  selector: 'app-recipe',
  standalone: true,
  imports: [
    NgForOf
  ],
  templateUrl: './recipe.component.html',
  styleUrl: './recipe.component.css'
})
export class RecipeComponent implements OnInit {

  public recipes: Recipe[]=[];

  constructor(private recipeService: RecipeService) {

  }

  ngOnInit(): void {
    this.load().then();
  }

  async load(): Promise<any> {
    this.recipes = [];
    this.recipes = await firstValueFrom(this.recipeService.getAll());
    console.log(this.recipes);
  }
}
