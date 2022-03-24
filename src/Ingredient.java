public class Ingredient {
  Valeur NomIngredient;

  Ingredient(Valeur nom) {
    this.NomIngredient = nom;
  }

  String getNomIngredient(){
    return NomIngredient.toString();
  }

}
