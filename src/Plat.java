import java.util.Arrays;

class Plat {
    private String ingredients[];

    Plat(String...ingredients){
        if(ingredients != null) {
            this.ingredients = Arrays.copyOf(ingredients, ingredients.length);
        }
    }

    public void afficherIngredients() {
        for(final String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }
}
