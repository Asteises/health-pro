import {Ingredients} from "./ingredients";
import {Step} from "./step";

export interface Recipe {

  name: string;
  category: string;
  cookingTime: string | number | Date;
  ingredients: Ingredients[];
  steps: Step[];
}
