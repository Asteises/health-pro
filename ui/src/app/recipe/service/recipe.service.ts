import {HttpClient} from "@angular/common/http";
import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {Recipe} from "../interfaces/recipe";

@Injectable({
  providedIn: 'root'
})
export class RecipeService {

  private readonly recipeURL: string;

  constructor(private httpClient: HttpClient) {
    this.recipeURL = 'http://localhost:8885/api/v1/recipe';
  }

  public getAll(): Observable<Recipe[]> {
    return this.httpClient.get<Recipe[]>(`${this.recipeURL}/all`);
  }
}
