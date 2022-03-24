import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        System.out.println("Quel écran souhaitez-vous afficher ?");
        System.out.println("1- Écran prise de commande");
        System.out.println("2- Écran cuisine");
        System.out.println("3- Écran bar");
        System.out.println("4- Écran Monitoring");
        
        Scanner scanner = new Scanner(System.in);
        
        int choixEcran = scanner.nextInt();
        
        Plat burger = new Plat("pain", "salade", "steack");
        burger.afficherIngredients();

        System.out.println("Vous avez choisi l'écran : " + choixEcran);

    }
}

class Table{

}

class Groupe{

}

class Personne{

}

class Lieu{
    
}

class Carte{
    
}

class Commande{
    
}

class Plat {
    String ingredients[];
    
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
