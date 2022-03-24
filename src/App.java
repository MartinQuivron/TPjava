import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Plat burger = new Plat("pain", "salade", "steack");
        burger.afficherIngredients();

        Client client = new Client("dupont", "bernard");
        System.out.println(client.getNom());
        System.out.println(client.getPrenom());

        Client client2 = new Client();
        System.out.println(client2.getNom());
        System.out.println(client2.getPrenom());

        Employe employe = new Employe("aled", "oscour", 20000);
        System.out.println(employe.getSalaire());

        Employe employe2 = new Employe();
        System.out.println(employe2.getSalaire());

        Ingredient tomate = new Ingredient(Valeur.TOMATE);
        System.out.println(tomate.getNomIngredient());




        System.out.println("Quel écran souhaitez-vous afficher ?");
        System.out.println("1- Écran prise de commande");
        System.out.println("2- Écran cuisine");
        System.out.println("3- Écran bar");
        System.out.println("4- Écran Monitoring");

        Scanner scanner = new Scanner(System.in);

        int choixEcran = scanner.nextInt();

        System.out.println("Vous avez choisi l'écran : " + choixEcran);

    }
}

class Barman extends Employe {

}

class Serveur extends Employe {

}

class Manager extends Employe {

}

class Cuisinier extends Employe {

}

class Salle {

}

class Restaurant extends Salle {

}

class Bar extends Salle {

}

class Cuisine extends Salle {

}

class Carte {

}

class Commande {

}

class Addition {

}
